package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationIntestNg {
  @Test
  public void f() {
	  Reporter.log("test case 1 execution",true);
  }
  @Test
  public void f1() {
	  Reporter.log("test case 2 execution",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("BeforeMethod execution",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("afterMethod execution",true);
	  
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("beforeClass execution",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterClass execution",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforeTest execution",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("afterTest execution",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite execution",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuite execution",true);
  }

}
