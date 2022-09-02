package org.test.unit_testing_with_junitJupitier;

import java.util.concurrent.TimeUnit;

public class Prime
{
	
public boolean PrimeNumber(int n) throws InterruptedException
{
  int counter=0;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
    {
      counter=counter+1;
    }
  }
  TimeUnit.MINUTES.sleep(2);
  if(counter==2)
  {
    return true;
  }
  else
  {
    return false;
  }
  
}
}
