package com.cubetiqs.exception;

/**
 * Null Exception
 *
 * @author sombochea
 * @since 1.0
 */
public class RNullException extends RException {
    public RNullException() {
    }

    public RNullException(String message) {
        super(message);
    }

    public RNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public RNullException(Throwable cause) {
        super(cause);
    }
}
