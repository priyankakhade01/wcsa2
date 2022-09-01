package assignpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOmayoBrowserWithoutUsingQuitMethod {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://omayo.blogspot.com/");
		    driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		            String parentHandle = driver.getWindowHandle();
	            System.out.println(parentHandle);
	            
	              Set<String> allhandles = driver.getWindowHandles();
	              for(String handle:allhandles)
	              {
	            	  if(!parentHandle.equals(handle)) {
	            	  driver.switchTo().window(handle);
	            	  driver.close();
	            	 }
	            	  else
	            	  {
	            		  
	            	  }
	            	  
	              }
	             
		}

}
