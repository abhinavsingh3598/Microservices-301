package com.mindtree.seatService.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.seatService.exceptions.ServiceException;
import com.mindtree.seatService.utilities.ApiResponse;



@RestControllerAdvice(assignableTypes = { SeatController.class })
public class GlobalExceptionalHandler {
	
Logger logger=LoggerFactory.getLogger(GlobalExceptionalHandler.class);

@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ApiResponse<String>> GlobalAdminExceptionHandler(Exception e) {

		ApiResponse<String> apiResponse = new ApiResponse<>();

		apiResponse.setBody(e.toString());
		apiResponse.setMessage(e.getMessage());
		apiResponse.setError(true);
		apiResponse.setStatus(HttpStatus.NOT_FOUND);
		logger.trace(e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiResponse);

	}

//	@ExceptionHandler(QuantityShouldNotNegative.class)
//	public ResponseEntity<ApiResponse> GlobalNegQuanExceptionHandler(Exception e) {
//
//		ApiResponse apiResponse = new ApiResponse();
//
//		apiResponse.setBody(e.getMessage());
//		apiResponse.setMessage(e.getLocalizedMessage());
//		apiResponse.setError(true);
//		apiResponse.setStatus(HttpStatus.BAD_REQUEST);
//		logger.trace(e.getMessage());
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiResponse);
//
//	}
//	@ExceptionHandler(ProductNotFoundException.class)
//	public ResponseEntity<ApiResponse> GlobalProductNotFoundExceptionHandler(Exception e) {
//
//		ApiResponse apiResponse = new ApiResponse();
//
//		apiResponse.setBody(e.getMessage());
//		apiResponse.setMessage(e.getLocalizedMessage());
//		apiResponse.setError(true);
//		apiResponse.setStatus(HttpStatus.BAD_REQUEST);
//		logger.trace(e.getMessage());
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiResponse);
//
//	}
}
