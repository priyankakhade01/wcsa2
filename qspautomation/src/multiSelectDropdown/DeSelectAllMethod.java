package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectAllMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/priya/Desktop/Selenium%20html%20file/multiselectdropdown.html");
		driver.manage().window().maximize();
		WebElement multiSelectdd = driver.findElement(By.id("menu"));
		    Select sel = new Select(multiSelectdd);
		    
		  for(int i=1;i<=5;i++)
		  {
			  sel.selectByIndex(i);
			  Thread.sleep(1000);
		  }
		  sel.deselectAll();
		
		}

	}

