package com.mindtree.adminService.exceptions;

public class ScreenNotPresentInEnteredTheater extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ScreenNotPresentInEnteredTheater() {
	}

	public ScreenNotPresentInEnteredTheater(String message) {
		super(message);
	}

	public ScreenNotPresentInEnteredTheater(Throwable cause) {
		super(cause);
	}

	public ScreenNotPresentInEnteredTheater(String message, Throwable cause) {
		super(message, cause);
	}

	public ScreenNotPresentInEnteredTheater(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
