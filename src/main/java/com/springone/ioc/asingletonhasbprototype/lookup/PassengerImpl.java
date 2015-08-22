package com.springone.ioc.asingletonhasbprototype.lookup;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("passenger")
public class PassengerImpl implements Passenger, ApplicationContextAware{
	
	private ApplicationContext applicationContext;
	
	/**
	 * @Lookup ("dayBusPass")
	 * This annotation attribute may suggest a target bean name to look up. If not specified, the target bean will be resolved based on the annotated method's return type declaration.
	 */
	public DayBusPass getDayBusPass() {
		return (DayBusPass)applicationContext.getBean("dayBusPass");
	}

	
	@Override
	public String toString() {
		return "Passenger - hashCode :: " + this.hashCode();
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
