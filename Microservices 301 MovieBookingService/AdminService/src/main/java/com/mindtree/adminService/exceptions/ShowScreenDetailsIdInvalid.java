package com.mindtree.adminService.exceptions;

public class ShowScreenDetailsIdInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowScreenDetailsIdInvalid() {
	}

	public ShowScreenDetailsIdInvalid(String message) {
		super(message);
	}

	public ShowScreenDetailsIdInvalid(Throwable cause) {
		super(cause);
	}

	public ShowScreenDetailsIdInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public ShowScreenDetailsIdInvalid(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
