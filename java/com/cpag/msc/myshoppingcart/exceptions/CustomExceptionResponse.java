package com.cpag.msc.myshoppingcart.exceptions;


public class CustomExceptionResponse {
	
	private int httpStatus;
	private String exceptionMsg;
	
	public CustomExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
	
}
