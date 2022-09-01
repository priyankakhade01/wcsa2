package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	 @Test
	  public void actiTimeLogin() {
		  int i=9/0;
		  System.out.println(i);
		  Reporter.log("Login suceessful",true);
	  }
	  
	  @Test(dependsOnMethods="actiTimeLogin")
	  public void actiTimeCreateUser()
	  {
		  Reporter.log("create user",true);
	  }
	  
	  @Test (dependsOnMethods="actiTimeLogin",alwaysRun=true)
	  public void actiTimeLogout()
	  {
		  Reporter.log("LogOut successful",true);
	  }
	  
}
