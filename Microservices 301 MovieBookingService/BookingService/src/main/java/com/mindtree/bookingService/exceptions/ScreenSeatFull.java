package com.mindtree.bookingService.exceptions;

public class ScreenSeatFull extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ScreenSeatFull() {
	}

	public ScreenSeatFull(String message) {
		super(message);
	}

	public ScreenSeatFull(Throwable cause) {
		super(cause);
	}

	public ScreenSeatFull(String message, Throwable cause) {
		super(message, cause);
	}

	public ScreenSeatFull(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
