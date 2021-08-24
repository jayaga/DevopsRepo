package com.test.qa;

import org.testng.annotations.Test;

public class QaTest 
{
  @Test
  
  public void test2() {
	  
	  if(System.getProperty("propFile")==null)
		  System.setProperty("propFile","default");
	  System.out.println("====================Executing tests on ================"+System.getProperty("propFile")+"  environment");

  }
}
