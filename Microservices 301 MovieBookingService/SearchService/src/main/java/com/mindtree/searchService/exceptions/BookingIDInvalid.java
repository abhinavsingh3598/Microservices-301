package com.mindtree.searchService.exceptions;

public class BookingIDInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookingIDInvalid() {
	}

	public BookingIDInvalid(String message) {
		super(message);
	}

	public BookingIDInvalid(Throwable cause) {
		super(cause);
	}

	public BookingIDInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public BookingIDInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
