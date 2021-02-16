package com.aop.practise1.step03_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.aop.practise1.step03_AOP.IPosition;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:PositionContext.xml");

		IPosition boss     = (IPosition)context.getBean("classBoss");
		IPosition manager  = (IPosition)context.getBean("classManager");
		IPosition employee = (IPosition)context.getBean("classEmployee");
		
		boss.work();
		manager.work();
		employee.work();
		
		///////////////////////////////
		
		boss.getWorkTime();
		manager.getWorkTime();
		employee.getWorkTime();
		
		///////////////////////////////
		
		employee.normal();
		employee.mistake();
	}
}
