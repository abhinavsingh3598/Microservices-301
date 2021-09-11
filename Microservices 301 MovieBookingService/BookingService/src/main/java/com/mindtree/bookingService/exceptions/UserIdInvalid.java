package com.mindtree.bookingService.exceptions;

public class UserIdInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserIdInvalid() {
	}

	public UserIdInvalid(String message) {
		super(message);
	}

	public UserIdInvalid(Throwable cause) {
		super(cause);
	}

	public UserIdInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public UserIdInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
