package com.mindtree.bookingService.exceptions;

public class ShowScreenIDInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowScreenIDInvalid() {
	}

	public ShowScreenIDInvalid(String message) {
		super(message);
	}

	public ShowScreenIDInvalid(Throwable cause) {
		super(cause);
	}

	public ShowScreenIDInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public ShowScreenIDInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
