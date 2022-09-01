package operationalMethodOfDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/priya/Desktop/Selenium%20html%20file/multiselectdropdown.html");
		

		WebElement multiselectdd = driver.findElement(By.id("menu"));
		    Select sel = new Select(multiselectdd);
		        boolean status  =sel.isMultiple();
		    System.out.println(status);
		    
	}

}
