package com.test.uat;

import org.testng.annotations.Test;

public class UATTest {
  @Test
  public void test3() {
	  
	  if(System.getProperty("propFile")==null)
		  System.setProperty("propFile","default");
	  
	  System.out.println("===========================Executing tests on ================= "+System.getProperty("propFile")+"  environment");

  }
}
