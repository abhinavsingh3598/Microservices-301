package com.mindtree.adminService.exceptions;

public class TheaterIdInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TheaterIdInvalid() {
	}

	public TheaterIdInvalid(String message) {
		super(message);
	}

	public TheaterIdInvalid(Throwable cause) {
		super(cause);
	}

	public TheaterIdInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public TheaterIdInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
