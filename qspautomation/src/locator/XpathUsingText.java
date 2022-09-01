package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']"));
         // driver.findElement(By.xpath("//h4[text()='Selenium Conf India 2022']"));
          driver.findElement(By.xpath("h1[contains(@class,'display-1 mt-0 mt-md-5 pb-1')]"));
	}

}
