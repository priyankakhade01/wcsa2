package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEasyCloth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://easy-clothes.com/en/login");

		driver.findElement(By.name("email")).sendKeys("anudesai123@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("anudesai123");
		driver.findElement(By.className("SubmitLogin")).click();
	}

}
