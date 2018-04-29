/**
 * 
 */
package org.telstra.fibonacci.srvc.rest.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.telstra.fibonacci.srvc.rest.exceptions.FibonacciException;

/**
 * @author Sarin
 *
 */
@RestControllerAdvice
public class FibonacciControllerAdvice {
	
	/**
	 * Method added to handle FibonacciException
	 * 
	 * @param request
	 * @param fibEx
	 */
	@ExceptionHandler(FibonacciException.class)
	@ResponseStatus(code=HttpStatus.CONFLICT, reason="Fibonacci App: Exception occurred during the calculation of fibanocci number.")
	public void handleException(HttpServletRequest request, FibonacciException fibEx) {
	}
	
	/**
	 * Method added to handle NumberFormatException
	 * 
	 * @param request
	 * @param nfEx
	 */
	@ExceptionHandler(NumberFormatException.class)
	@ResponseStatus(code=HttpStatus.METHOD_NOT_ALLOWED, reason="Fibonacci App: Text not allowed as request parameter.")
	public void handleException(HttpServletRequest request, NumberFormatException nfEx) {
	}
	
	/**
	 *  Method added to handle Exception
	 *  
	 * @param request
	 * @param ex
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code=HttpStatus.METHOD_NOT_ALLOWED, reason="Fibonacci Application Error.")
	public void handleException(HttpServletRequest request, Exception ex) {
	}

}
