package com.mindtree.adminService.exceptions;

public class ScreenIDInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ScreenIDInvalid() {
	}

	public ScreenIDInvalid(String message) {
		super(message);
	}

	public ScreenIDInvalid(Throwable cause) {
		super(cause);
	}

	public ScreenIDInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public ScreenIDInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
