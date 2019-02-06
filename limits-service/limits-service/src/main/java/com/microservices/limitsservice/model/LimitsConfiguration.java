package com.microservices.limitsservice.model;

public class LimitsConfiguration {

	private long minimum;
	private long maximum;
	
	protected LimitsConfiguration() {
	}
	
	public LimitsConfiguration(long minimum, long maximum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public long getMaximum() {
		return maximum;
	}
	public void setMaximum(long maximum) {
		this.maximum = maximum;
	}
	public long getMinimum() {
		return minimum;
	}
	public void setMinimum(long minimum) {
		this.minimum = minimum;
	}
	
	
}
