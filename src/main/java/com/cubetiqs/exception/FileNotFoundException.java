package com.cubetiqs.exception;

/**
 * File not found exception
 *
 * @author sombochea
 * @since 1.0
 */
public class FileNotFoundException extends RIOException {
    public FileNotFoundException() {
        super("File not found!");
    }

    public FileNotFoundException(String message) {
        super(message);
    }

    public FileNotFoundException(Throwable cause) {
        super(cause);
    }
}
