package javaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disablewebelwment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/priya/Desktop/Selenium%20html%20file/disabledelement.html");
		
		
		//disable webElement
		        JavascriptExecutor jse = (JavascriptExecutor)driver;
		        jse.executeScript("document.getElementById('i1').value='admin'");

	}

}
