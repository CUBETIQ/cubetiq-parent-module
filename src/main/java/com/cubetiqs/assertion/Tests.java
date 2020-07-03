package com.cubetiqs.assertion;

/**
 * Assertion and Tests
 * This class used for check and validation and throwable error
 *
 * @author sombochea
 * @since 1.0
 */
public final class Tests {
    public static void isTrue(boolean val) throws TestsException {
        assert val;
    }

    public static void isTrue(boolean val, String message) throws TestsException {
        try {
            isTrue(val);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isNotTrue(boolean val) throws TestsException {
        assert !val;
    }

    public static void isNotTrue(boolean val, String message) throws TestsException {
        try {
            isNotTrue(val);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isNull(Object val) throws TestsException {
        assert val == null;
    }

    public static void isNull(Object val, String message) throws TestsException {
        try {
            isNull(val);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isNotNull(Object val) throws TestsException {
        assert val != null;
    }

    public static void isNotNull(Object val, String message) throws TestsException {
        try {
            isNotNull(val);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isEmpty(String val) throws TestsException {
        assert val.isEmpty();
    }

    public static void isEmpty(String val, String message) throws TestsException {
        try {
            isEmpty(val);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isNotEmpty(String val) throws TestsException {
        assert !val.isEmpty();
    }

    public static void isNotEmpty(String val, String message) throws TestsException {
        try {
            isNotEmpty(val);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isBlank(String val) throws TestsException {
        assert val.trim().isEmpty();
    }

    public static void isBlank(String val, String message) throws TestsException {
        try {
            isBlank(val);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isNotBlank(String val) throws TestsException {
        assert !val.trim().isEmpty();
    }

    public static void isNotBlank(String val, String message) throws TestsException {
        try {
            isNotBlank(val);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isEquals(Object val1, Object val2) throws TestsException {
        assert val1 == val2;
    }

    public static void isEquals(Object val1, Object val2, String message) throws TestsException {
        try {
            isEquals(val1, val2);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }

    public static void isNotEquals(Object val1, Object val2) throws TestsException {
        assert val1 != val2;
    }

    public static void isNotEquals(Object val1, Object val2, String message) throws TestsException {
        try {
            isNotEquals(val1, val2);
        } catch (AssertionError error) {
            throw new TestsException(message);
        }
    }
}
