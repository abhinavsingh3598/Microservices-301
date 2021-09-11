package com.mindtree.adminService.exceptions;

public class InvalidSeatNumber extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSeatNumber() {
	}

	public InvalidSeatNumber(String message) {
		super(message);
	}

	public InvalidSeatNumber(Throwable cause) {
		super(cause);
	}

	public InvalidSeatNumber(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidSeatNumber(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
