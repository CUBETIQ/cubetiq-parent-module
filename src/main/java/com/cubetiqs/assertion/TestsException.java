package com.cubetiqs.assertion;

/**
 * Default Assertion/Tests Exception
 *
 * @author sombochea
 * @see AssertionError
 * @see Error
 * @see Throwable
 * @since 1.0
 */
public class TestsException extends AssertionError {
    public TestsException() {
        super("tests failed");
    }

    public TestsException(String message) {
        super(message);
    }

    public TestsException(Throwable cause) {
        super(cause);
    }
}
