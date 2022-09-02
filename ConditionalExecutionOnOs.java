package org.test.unit_testing_with_junitJupitier;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
public class ConditionalExecutionOnOs {

@Test
@DisabledOnOs(OS.WINDOWS)
void addAppleTestCaseZ()
{
	System.out.println("addAppleTestCaseZ");
	AppleCalculator applecalculator=new AppleCalculator();
	assertEquals(2,applecalculator.addApple(1, 1));
}
@Test
@EnabledOnOs(OS.WINDOWS)
@DisabledOnOs({OS.LINUX,OS.MAC,OS.SOLARIS})
void addAppleTestCaseW()
{
	System.out.println("addAppleTestCaseZ");
	AppleCalculator applecalculator=new AppleCalculator();
	assertEquals(2,applecalculator.addApple(1, 1));
}
}