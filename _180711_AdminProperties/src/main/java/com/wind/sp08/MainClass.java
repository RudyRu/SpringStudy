package com.wind.sp08;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		/*
		context객체 생성 -> context객체인 ctx에 getEnvironment메소드를 써서 Environment객체 생성
		-> Environment객체인 env에 getPropertySources 메소드를 써서 propertySources객체 생성
		-> propertySources에 classpath로 admin정보가 있는 파일 연결해서 admin정보를 얻어 올 수 있도록 한다.
		*/
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			//프로퍼티 추가하는 부분.. addLast메소드 이용
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
			
		}catch(Exception e) {			
			e.printStackTrace();
		}	
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
		gCtx.load("classpath:applicationCTX.xml");
		gCtx.refresh();		//실제 spring 컨테이너를 생성
		
		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin ID : " + adminConnection.getAdminId());
		System.out.println("admin PW : " +adminConnection.getAdminPw());
		
	}

}
