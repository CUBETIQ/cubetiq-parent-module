package com.cubetiqs.exception;

/**
 * Runtime Exception
 *
 * @author sombochea
 * @see RuntimeException
 * @since 1.0
 */
public class RException extends RuntimeException {
    public RException() {
    }

    public RException(String message) {
        super(message);
    }

    public RException(String message, Throwable cause) {
        super(message, cause);
    }

    public RException(Throwable cause) {
        super(cause);
    }

    public RException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
