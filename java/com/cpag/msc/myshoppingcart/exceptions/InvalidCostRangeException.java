package com.cpag.msc.myshoppingcart.exceptions;

public class InvalidCostRangeException extends Exception{

	private int minRange;
	private int maxRange;
	
	



	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public InvalidCostRangeException(int minRange, int maxRange) {
		super();
		this.minRange = minRange;
		this.maxRange = maxRange;
	}

	public InvalidCostRangeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidCostRangeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidCostRangeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidCostRangeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidCostRangeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
