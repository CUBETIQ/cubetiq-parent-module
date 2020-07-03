package com.cubetiqs.test;

import com.cubetiqs.assertion.Tests;
import org.junit.Test;

public class AssertionTests {
    @Test
    public void equalsTests() {
        Tests.isEquals("1", "1", "values are not equals");
        Tests.isNotEquals("1", "2", "values are equals");
    }
}
