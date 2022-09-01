package assignpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']"));
		     Actions act = new Actions(driver);
		     act.doubleClick(target).perform();

	}

}
