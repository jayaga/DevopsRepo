package com.test.dev;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import MyApp.*;

public class DevTest {
  @Test
  public void test1() {
	  
	  System.out.println("Executing tests on  "+System.getProperty("propFile")+"  environment");
	  
  }
  
 
  
}
