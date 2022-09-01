package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataPrivider {
	WebDriver driver;
  @Test(dataProvider = "dataprovider1")
  public void f(String invaildusername, String invaildpassword) {
	  driver.findElement(By.name("username")).sendKeys(invaildusername);
	  driver.findElement(By.name("pwd")).sendKeys(invaildpassword);
	  driver.findElement(By.id("loginButton")).click();
  }
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	   driver.get("http://127.0.0.1/login.do;jsessionid=77epsrqti8q6f");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dataprovider1() {
    Object [] []data= new Object[5][2];
       data [0] [0] ="admin"; 
       data [0] [1] ="manager1";
       
       data [1] [0] ="admanger";
       data [1] [1] ="manger123";
       
       data [2] [0] ="ad123";
       data [2] [1] ="manager123";
       
       data [3] [0] ="manager@123";
       data [3] [1] ="manager";
       
       data [4] [0] ="admin";
       data [4] [1] ="admin";
    
	return data;
  }
}
