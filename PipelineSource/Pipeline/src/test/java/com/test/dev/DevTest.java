package com.test.dev;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import MyApp.*;

public class DevTest {
  @Test
  public void test1() {
	  if(System.getProperty("propFile")==null)
		  System.setProperty("propFile","default");
	  System.out.println("=======================Executing tests on the ============ "+System.getProperty("propFile")+"  environment");
	  
  }
  
 
  
}
