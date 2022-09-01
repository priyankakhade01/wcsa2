package webBasePopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupGetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/priya/Desktop/Selenium%20html%20file/alert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		    Alert al = driver.switchTo().alert();
		    Thread.sleep(2000);
		      String text = al.getText();
		      System.out.println(text);

	}

}
