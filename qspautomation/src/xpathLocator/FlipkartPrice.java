package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sumsung f22");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		String priceOfSumsungf22 = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Blue, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(priceOfSumsungf22);
	}

}

