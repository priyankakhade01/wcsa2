package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMessenger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/messenger/");
        
        driver.findElement(By.name("email")).sendKeys("avirdr567@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("786950");
        //driver.findElement(By.id("login_link")).click();

	}

}
