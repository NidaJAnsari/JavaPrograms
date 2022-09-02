package org.test.unit_testing_with_junitJupitier;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.MethodName.class)
public class AppleCalculatorOrder {
@Test
void addAppleTestCaseZ()
{
	System.out.println("addAppleTestCaseZ");
	AppleCalculator applecalculator=new AppleCalculator();
	assertEquals(2,applecalculator.addApple(1, 1));
}
@Test
void addAppleTestCaseY()
{
	System.out.println("addAppleTestCaseY");
	AppleCalculator applecalculator=new AppleCalculator();
	assertEquals(2,applecalculator.addApple(2, 2));
}

@Test
void addAppleTestCaseX()
{
	System.out.println("addAppleTestCaseX");
	AppleCalculator applecalculator=new AppleCalculator();
	assertEquals(6,applecalculator.addApple(3, 3));
}

@Test
void addAppleTestCaseW()
{
	System.out.println("addAppleTestCaseW");
	AppleCalculator applecalculator=new AppleCalculator();
	assertEquals(8,applecalculator.addApple(4, 4));
}


}


