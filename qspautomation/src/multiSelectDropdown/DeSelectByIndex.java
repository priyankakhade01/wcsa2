package multiSelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex {

	public static void main(String[] args) throws InterruptedException   {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/priya/Desktop/Selenium%20html%20file/multiselectdropdown.html");
        driver.manage().window().maximize();
        WebElement multiSelectdd = driver.findElement(By.id("menu"));
        Thread.sleep(3000);
        Select sel = new Select(multiSelectdd);
        sel.selectByValue("v3");
        
        Thread.sleep(2000);
        
        sel.deselectByIndex(2);
        
        
            
	}

}
