package com.github.koendeschacht.jsonrpc4j;

import java.io.IOException;

/**
 * Unchecked exception aimed to preserve error response body in case of http error.
 *
 * @author Alexander Makarov
 */
@SuppressWarnings("WeakerAccess")
public class HttpException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public HttpException(String message, IOException cause) {
		super(message, cause);
	}
}
