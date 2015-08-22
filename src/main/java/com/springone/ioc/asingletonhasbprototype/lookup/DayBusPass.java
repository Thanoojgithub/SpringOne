package com.springone.ioc.asingletonhasbprototype.lookup;

import org.springframework.stereotype.Component;

@Component("dayBusPass")
public class DayBusPass {
	
	@Override
	public String toString() {
		return "DayBusPass - hashCode :: " + this.hashCode();
	}

}
