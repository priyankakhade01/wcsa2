package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		Rectangle rect = loginButton.getRect();
		System.out.println("Height:"+rect.getHeight());
		System.out.println("Width:"+rect.getWidth());
		System.out.println("Xaxis:"+rect.getX());
		System.out.println("Yaxis:"+rect.getY());

	}

}
