package com.wittybrains.busbookingsystem.exception;

public class InvalidSourceOrDestinationException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidSourceOrDestinationException(String message) {
        super(message);
    }
}
