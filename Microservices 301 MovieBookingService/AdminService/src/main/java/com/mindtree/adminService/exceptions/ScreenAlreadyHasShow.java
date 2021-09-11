package com.mindtree.adminService.exceptions;

public class ScreenAlreadyHasShow extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ScreenAlreadyHasShow() {
	}

	public ScreenAlreadyHasShow(String message) {
		super(message);
	}

	public ScreenAlreadyHasShow(Throwable cause) {
		super(cause);
	}

	public ScreenAlreadyHasShow(String message, Throwable cause) {
		super(message, cause);
	}

	public ScreenAlreadyHasShow(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
