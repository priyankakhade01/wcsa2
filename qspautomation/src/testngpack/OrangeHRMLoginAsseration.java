package testngpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class OrangeHRMLoginAsseration {
	WebDriver driver;
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @Test
  public void OrangeHRMTest() throws InterruptedException {
	  
	        String loginpageTitle = driver.getTitle();
	                 SoftAssert sa = new SoftAssert();
	               sa.assertEquals(loginpageTitle, "OrangeHRM-log");  
	               Reporter.log("Login page is verified ");
  

  
                boolean statusofusernameTestBox = driver.findElement(By.id("username")).isDisplayed();
                 Assert.assertEquals(statusofusernameTestBox, true);
                 Reporter.log("user text box is displyed ",true);
                 driver.findElement(By.name("username")).sendKeys("Admin");
                
                 boolean statusofpasswodTestBox = driver.findElement(By.id("passwword")).isDisplayed();
                 Assert.assertEquals(statusofpasswodTestBox,true);
                 Reporter.log("user text box is displyed ",true);
                 driver.findElement(By.id("passwword")).sendKeys("admin123");
                 
                 boolean statusofloginButtonTestBox = driver.findElement(By.xpath("//button[.='Login']")).isDisplayed();
                 Assert.assertEquals(statusofloginButtonTestBox,true);
                 Reporter.log("user text box is displyed ",true);
                 driver.findElement(By.xpath("//button[.='Login']")).click();
                 
                 //--------------------------------------
                 
                 Thread.sleep(4000);
                             String homePageTitle = driver.getTitle();
                             sa.assertEquals(homePageTitle, "Emlpoyee List");
                             Reporter.log("Home page title is verified ",true);
                             Reporter.log("Add Employee",true);
                             sa.assertAll();
  }
  public void tearDown()
  {
	  driver.quit();
  }
  
}
