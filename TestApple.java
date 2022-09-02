package org.test.unit_testing_with_junitJupitier;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class TestApple {
	static final Logger Log=Logger.getLogger(TestApple.class.getName());
@ParameterizedTest
@ValueSource(strings= {"McIntosh","Fuji","Gala"})
public void test(String appleName)
{
	AppleCalculation cal=new AppleCalculation();
	Log.info(appleName);
	assertTrue(cal.isApple(appleName),"yes it is an apple");
	
}
}
