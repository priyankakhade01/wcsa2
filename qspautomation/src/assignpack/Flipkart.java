package assignpack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebdriver.GetwindowHandle;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[.='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys("Iphone 12");
	    
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	    String parentHandle= driver.getWindowHandle();
	    Set<String> alltabs = driver.getWindowHandles();
	    
	    for(String tab:alltabs)
	    {
	    	System.out.println(tab);
	    	if (!parentHandle.equals(tab)){
	    		System.out.println(tab);
	    		driver.switchTo().window(tab);
				
			}
	    	else
	    	{
	    		
	    	}
	    	
	    	
	    }
	    Thread.sleep(4000);
	     driver.findElement(By.xpath("//div[text()='Green']/ancestor::div[@class='_2OTVHf _3NVE7n _1mQK5h _2J-DXM']/preceding-sibling::a")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[contains(text(),'256 GB')]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("pincodeInputId")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
	      driver.findElement(By.xpath("//span[contains(text(),'Check')]")).click();
	      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	     driver.findElement(By.xpath("//div[.='Remove' and @class='_3dsJAO _24d-qY FhkMJZ' ]")).click();
	}
	
}
