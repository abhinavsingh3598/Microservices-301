package com.mindtree.adminService.exceptions;

public class GenreIDInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenreIDInvalid() {
	}

	public GenreIDInvalid(String message) {
		super(message);
	}

	public GenreIDInvalid(Throwable cause) {
		super(cause);
	}

	public GenreIDInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public GenreIDInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
