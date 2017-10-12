package com.siebre.itx.schema.validation;

/**
 * Created by jhonelee on 2017/8/25.
 */
public class JsonSchemaParseException extends RuntimeException {

	public JsonSchemaParseException() {
		super();
	}

	public JsonSchemaParseException(String message) {
		super(message);
	}

	public JsonSchemaParseException(String message, Throwable cause) {
		super(message, cause);
	}

	public JsonSchemaParseException(Throwable cause) {
		super(cause);
	}

	protected JsonSchemaParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
