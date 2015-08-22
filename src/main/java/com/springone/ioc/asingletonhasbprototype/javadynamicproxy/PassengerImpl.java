package com.springone.ioc.asingletonhasbprototype.javadynamicproxy;

public class PassengerImpl implements Passenger{
	
	private DayBusPass  dayBusPass;

	public DayBusPass getDayBusPass() {
		return dayBusPass;
	}

	@Override
	public String toString() {
		return "Passenger - hashCode :: " + this.hashCode();
	}

}
