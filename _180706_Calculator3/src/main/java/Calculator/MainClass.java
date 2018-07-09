package Calculator;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//String타입의  주소를 가지고 있는 변수    자체의 정보가 주소를 가지고 있다.
		//src.main.resources or src.main.java하위의 파일 중 일치하는 것을 불러온다.
		String configLocation = "classpath:applicationCTX.xml";
		//xml파일안에 들어있는 정보가 들어있는 ctx객체를 생성
		//객체와 객체를 연결하기 위한 주소를 담은 객체
		AbstractApplicationContext ctx 
		= new GenericXmlApplicationContext(configLocation);
		
		//이름,파일이름
		//ctx안에  MyCalculator클래스로 만들어진 객체 즉,myCalculator라는 이름을 가진 bean을 생성
		MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		ctx.close();
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}

}
