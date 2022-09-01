package testngpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
  

@Test
  public void f() {
	  Reporter.log("Enter the url",true);
	  Reporter.log("Verify the title of login page",true);
	     SoftAssert softassert = new SoftAssert();
	     softassert.assertEquals(false, true);
	     
	     
	     
      Reporter.log("Enter the username",true);
	  Reporter.log("Enter the password",true);
	  //Assert.assertEquals(false, true);
	  Reporter.log("Enter the login",true);
	  Reporter.log("Enter the homepage",true);
	  Reporter.log("Create user",true);
	  Reporter.log("Create report",true);
	  softassert.assertAll();
  }
}
