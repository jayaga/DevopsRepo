package com.test.prod;

import org.testng.annotations.Test;

public class ProdTest {
  @Test
  public void test4() {
	  System.out.println("Executing tests on  "+System.getProperty("propFile")+"  environment");

  }
}
