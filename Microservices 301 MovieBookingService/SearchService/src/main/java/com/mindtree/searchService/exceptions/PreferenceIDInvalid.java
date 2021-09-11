package com.mindtree.searchService.exceptions;

public class PreferenceIDInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PreferenceIDInvalid() {
	}

	public PreferenceIDInvalid(String message) {
		super(message);
	}

	public PreferenceIDInvalid(Throwable cause) {
		super(cause);
	}

	public PreferenceIDInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public PreferenceIDInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}