package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        
        driver.findElement(By.id("email")).sendKeys("manjuadar567@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("890765");
        driver.findElement(By.id("loginbutton")).click();
	}

}
