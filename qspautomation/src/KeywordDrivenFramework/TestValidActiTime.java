package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestValidActiTime extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		   BaseTest bt = new BaseTest();
		    bt.openBrowser();  //Open the Browser
		       Flib flib = new Flib();
		       
		 // read the data for property
		 String username = flib.readPropertyFile("./data/config.properties","username");
		 String passward = flib.readPropertyFile("./data/config.properties","passward");
		       
		       
		 //valid login
		       
		 driver.findElement(By.name("username")).sendKeys(username);
         driver.findElement(By.name("pwd")).sendKeys(passward);
         Thread.sleep(3000);
        driver.findElement(By.id("loginButton")).click();
          Thread.sleep(2000);
          bt.closeBrowser();   //close all browsers
		   
		   
		

	}

}
