package org.test.unit_testing_with_junitJupitier;

import java.util.Arrays;
import java.util.List;

public class AppleCalculation {
List<String> apples=Arrays.asList("McIntosh","Gala","Jonagold","PinkLady","Fuji");
public boolean isApple(String appleName)
{
	return apples.contains(appleName);
}
}
