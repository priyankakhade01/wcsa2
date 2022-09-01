package javaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingLeft {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		Thread.sleep(2000);
		
		           JavascriptExecutor jse = (JavascriptExecutor)driver;
		           jse.executeScript("window.scroll(1000,0)");
		           Thread.sleep(2000);
		           
		           jse.executeScript("window.scroll(-1000,0)");
		           
		           
		
		

	}

}
