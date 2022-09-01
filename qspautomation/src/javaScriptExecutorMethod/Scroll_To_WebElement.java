package javaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_To_WebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.primevideo.com");
		
		WebElement DocuBay = driver.findElement(By.xpath("//img[@alt='TV DocuBay']"));
		            Point loc = DocuBay.getLocation();
		                     int x = loc.getX();
		                     int y = loc.getY();
		                     
		                     System.out.println(y);
		                     
		                     JavascriptExecutor jse = (JavascriptExecutor)driver;
		  		           jse.executeScript("window.scrollBy(\"+x+\",\"y-50)+\");");
		                     
		                     

	}

}
