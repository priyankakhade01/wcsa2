package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/priya/Desktop/Selenium%20html%20file/checkbox.html");
        Thread.sleep(3000);
        WebElement automationcheckBox = driver.findElement(By.id("automation"));
        automationcheckBox.click();
        boolean status = automationcheckBox.isSelected();
        System.out.println(status);
	}

}
