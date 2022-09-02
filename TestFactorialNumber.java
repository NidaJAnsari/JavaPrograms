package org.test.unit_testing_with_junitJupitier;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFactorialNumber {
    @Test
    public void factorialFive() {
    	TestFactorialNumber f = new TestFactorialNumber();
        int expected = 0;
        int actual = f.fact(0);
        assertEquals(expected, actual);
    }

	private int fact(int i) {
		
		return 0;
	}
}