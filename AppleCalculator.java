package org.test.unit_testing_with_junitJupitier;

public class AppleCalculator {
     public int addApple(int apple1,int apple2)
     {
    	 return apple1+apple2;
     }
     public boolean booleanApple(String appleText)
     {
    	 return "apple".equals(appleText);     
    	 }

public double simpleInterest(double p,double r,double t)
{
	return (p*r*t)/100;
}
public boolean checkNegativeNumber(int number)
{
	if(number>0)
	{
		return true;
		
		
	}
	else
	{
		return false;
	}
}
public int[] arrayTest()
{
	int[] ar= {1,2,3,4,5};
	
		return ar;		
}

}