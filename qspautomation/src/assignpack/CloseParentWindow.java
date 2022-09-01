package assignpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://omayo.blogspot.com/");
	    driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	            String parenthandle = driver.getWindowHandle();
            System.out.println(parenthandle);
            driver.close();

	}

}
