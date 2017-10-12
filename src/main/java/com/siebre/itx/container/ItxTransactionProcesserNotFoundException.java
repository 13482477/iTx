package com.siebre.itx.container;

/**
 * Created by jhonelee on 2017/8/25.
 */
public class ItxTransactionProcesserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6911455846092246811L;

	public ItxTransactionProcesserNotFoundException() {
		super();
	}

	public ItxTransactionProcesserNotFoundException(String message) {
		super(message);
	}

	public ItxTransactionProcesserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ItxTransactionProcesserNotFoundException(Throwable cause) {
		super(cause);
	}

	protected ItxTransactionProcesserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
