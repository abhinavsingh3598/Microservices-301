package com.mindtree.seatService.exceptions;

public class ShowScreenDetailsIDInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowScreenDetailsIDInvalid() {
	}

	public ShowScreenDetailsIDInvalid(String message) {
		super(message);
	}

	public ShowScreenDetailsIDInvalid(Throwable cause) {
		super(cause);
	}

	public ShowScreenDetailsIDInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public ShowScreenDetailsIDInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
