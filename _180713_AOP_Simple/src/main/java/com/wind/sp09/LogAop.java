package com.wind.sp09;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable {
			
			// 전처리
			String signatureStr = joinpoint.getSignature().toShortString();
			System.out.println(signatureStr + " is start.");
			long st = System.currentTimeMillis();
			
			// 핵심코드
			try {
				Object obj = joinpoint.proceed();
				return obj;
			} finally {
			// 후처리
				long et = System.currentTimeMillis();
				System.out.println(signatureStr + "경과시간 : " + (et-st));
			}
		}
		
		public void beforeAdvice(JoinPoint joinPoint) {
			System.out.println("#### beforeAdvice()");
		}
		public void afterAdvice(JoinPoint joinPoint) {
			System.out.println("#### afterAdvice()");
		}
		public void afterThrowingAdvice(JoinPoint joinPoint) {
			System.out.println("#### afterThrowingAdvice()");
		}
		public void afterReturningAdvice(JoinPoint joinPoint) {
			System.out.println("#### afterReturingAdvice()");
		}
		
}
