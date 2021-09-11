package com.mindtree.adminService.exceptions;

public class CastCrewIDInvalid extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CastCrewIDInvalid() {
	}

	public CastCrewIDInvalid(String message) {
		super(message);
	}

	public CastCrewIDInvalid(Throwable cause) {
		super(cause);
	}

	public CastCrewIDInvalid(String message, Throwable cause) {
		super(message, cause);
	}

	public CastCrewIDInvalid(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
