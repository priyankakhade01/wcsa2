package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(enabled=false)
  public void method1() {
	  Reporter.log("actimeTime Valid",true);
  }
  
  @Test
  public void method2(){
	  
	  Reporter.log("Actitime Create User",true);
  }
  
  @Test
  public void method3()
  {
	  Reporter.log("ActiTime Create reports",true);
  }
  
}
