package org.test.unit_testing_with_junitJupitier;

public class FactorialNumber {
    public int fact(int number) {
        int i = 1;
        int result = 1;
        while (i <= number) {
            result = result * i;
            i++;
        }
        return result;
    }
}


	


