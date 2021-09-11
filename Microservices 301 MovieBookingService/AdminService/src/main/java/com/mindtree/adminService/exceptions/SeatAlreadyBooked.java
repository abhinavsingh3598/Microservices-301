package com.mindtree.adminService.exceptions;

public class SeatAlreadyBooked extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SeatAlreadyBooked() {
	}

	public SeatAlreadyBooked(String message) {
		super(message);
	}

	public SeatAlreadyBooked(Throwable cause) {
		super(cause);
	}

	public SeatAlreadyBooked(String message, Throwable cause) {
		super(message, cause);
	}

	public SeatAlreadyBooked(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
