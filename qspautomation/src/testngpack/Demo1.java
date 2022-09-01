package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void demo1() {
	  Reporter.log("method1 executed",true);
  }
	  
	 @Test
	 public void a(){
		 int i=7/0;
		 Reporter.log("executed",true);
		 
		 
		
		 
	 }
  }

