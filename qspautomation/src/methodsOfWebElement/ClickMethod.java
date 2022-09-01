package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/priya/Desktop/Selenium%20html%20file/flipkartlink.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText(" flip")).click();

	}

}
