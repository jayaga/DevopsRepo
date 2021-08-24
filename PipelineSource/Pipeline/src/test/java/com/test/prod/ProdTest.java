package com.test.prod;

import org.testng.annotations.Test;

public class ProdTest {
  @Test
  public void test4() {
	  if(System.getProperty("propFile")==null)
		  System.setProperty("propFile","default");
	  System.out.println("=============Executing tests onnn =========== "+System.getProperty("propFile")+"  environment");

  }
}
