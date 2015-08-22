package com.springone.ioc.asingletonhasbprototype.cglib;

public class Passenger {
	
	private DayBusPass  dayBusPass;

	public DayBusPass getDayBusPass() {
		return dayBusPass;
	}

	@Override
	public String toString() {
		return "Passenger - hashCode :: " + this.hashCode();
	}

}
