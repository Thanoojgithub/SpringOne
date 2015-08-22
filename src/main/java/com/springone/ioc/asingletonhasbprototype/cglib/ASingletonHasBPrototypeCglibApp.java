package com.springone.ioc.asingletonhasbprototype.cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ASingletonHasBPrototypeCglibApp {

	final static Logger logger = LoggerFactory.getLogger(ASingletonHasBPrototypeCglibApp.class);
	
	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("asingletonhasbprototype-cglib-beans.xml")) {
			Passenger passenger = (Passenger)context.getBean("passenger");
			/**
			 * hashCode for 'passenger' instance is same, as it is a singleton scope by default Spring IOC.
			 * where as, for 'dayBusPass', hashCode is different for every time when we we call get instance of it.
			 */
			logger.info(passenger + " || "+passenger.getDayBusPass());
			logger.info(passenger + " || "+passenger.getDayBusPass());
			logger.info(passenger + " || "+passenger.getDayBusPass());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * 
 * http://docs.spring.io/spring/docs/4.1.0.RELEASE/spring-framework-reference/html/beans.html#beans-factory-method-injection
 */