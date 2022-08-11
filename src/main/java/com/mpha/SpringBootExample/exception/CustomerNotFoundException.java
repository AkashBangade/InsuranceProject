package com.mpha.SpringBootExample.exception;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException(String cause)
	{
			super(cause);
	}
}
