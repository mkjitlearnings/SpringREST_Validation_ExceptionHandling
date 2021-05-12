package com.cpag.msc.myshoppingcart.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<CustomExceptionResponse> xyz(java.util.NoSuchElementException exp)
	{
		
		System.out.println("========>> inside exception handler of product not found ");
		CustomExceptionResponse exceptionResponse = new CustomExceptionResponse();
		
		exceptionResponse.setHttpStatus(HttpStatus.NOT_FOUND.value());
		exceptionResponse.setExceptionMsg("Invalid product id , pls try again");
		
		return new ResponseEntity<CustomExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<CustomExceptionResponse> xyz(InvalidCostRangeException exp)
	{
		int range1 = exp.getMinRange();
		int range2 = exp.getMaxRange();
		
		System.out.println("========>> inside exception handler of product not found ");
		CustomExceptionResponse exceptionResponse = new CustomExceptionResponse();
		
		exceptionResponse.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		exceptionResponse.setExceptionMsg("Invalid product cost range "+range1+" & "+range2+", pls try again");
		
		return new ResponseEntity<CustomExceptionResponse>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}
}
