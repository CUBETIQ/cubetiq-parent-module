package com.cubetiqs.exception;

import java.io.IOException;

/**
 * IO Exception
 *
 * @author sombochea
 * @since 1.0
 */
public class RIOException extends IOException {
    public RIOException() {
    }

    public RIOException(String message) {
        super(message);
    }

    public RIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public RIOException(Throwable cause) {
        super(cause);
    }
}
