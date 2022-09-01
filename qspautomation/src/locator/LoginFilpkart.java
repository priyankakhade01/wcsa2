package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFilpkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		
		driver.findElement(By.name("text")).sendKeys("pdhalude89@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pd489023");
		driver.findElement(By.name("submit")).click();

	}

}
