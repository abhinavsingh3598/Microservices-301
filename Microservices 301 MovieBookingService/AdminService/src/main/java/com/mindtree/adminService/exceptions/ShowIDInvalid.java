package com.mindtree.adminService.exceptions;

public class ShowIDInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowIDInvalid() {
	}

	public ShowIDInvalid(String message) {
		super(message);
	}

	public ShowIDInvalid(Throwable cause) {
		super(cause);
	}

	public ShowIDInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public ShowIDInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
