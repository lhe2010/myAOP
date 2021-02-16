package com.aop.practise1.step03_AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class MyAspect {
	
//	private static Logger logger = LoggerFactory.getLogger(MyAspect.class);

	// 메서드 호출 전
	@Before("execution(pubic void com.aop.practise1.step03_AOP.classBoss.work())")
	
	// 메서드 호출 후

	////////////////////////////////////////////////////////////////////////
	
	// 메서드 호출 전 후 
	
	////////////////////////////////////////////////////////////////////////
	
	// 호출된 메서드가 성공적으로 실행 된 후 
	
	// 호출된 메서드에서 예외발생 후 
	
}
