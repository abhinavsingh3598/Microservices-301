package com.mindtree.bookingService.utilities;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter@Setter
public class ApiResponse<T> {

	private String message;
	private HttpStatus status;
	private boolean error;
	private T body;
    private boolean success;
    
	
	
}
