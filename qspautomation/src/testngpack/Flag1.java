package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description="This test is used to perform a vaild login")
  public void vaildActiTimeTest(){
	  Reporter.log("vaild login is performed",true);
	  
  }
  @Test(description="This test is used to perform a invaild login")
  public void invaildActiTimeTest(){
	  Reporter.log("invaild login is performed",true);
  }
  
  
}
