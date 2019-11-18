package com.ascorp.microservices.limitsservice.bean;

public class LimitConfiguation {

	private int maximum;
	private int minimum;

	protected LimitConfiguation() {
		super();
	}

	public LimitConfiguation(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}
}
