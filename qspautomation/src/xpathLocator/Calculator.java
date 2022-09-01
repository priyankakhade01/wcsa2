package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		driver.findElement(By.xpath("//span[@class='scinm' and .='1']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='+']")).click();
		
		driver.findElement(By.xpath("//span[@class='scinm' and .='2']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		
		
		String result = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//span[@class='scinm' and .='2']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='–']")).click();
		
		driver.findElement(By.xpath("//span[@class='scinm' and .='1']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		
		String result1= driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result1);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//span[@class='scinm' and .='1']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='×']")).click();
		
		driver.findElement(By.xpath("//span[@class='scinm' and .='2']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		
		String result2 = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result2);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//span[@class='scinm' and .='2']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		
		driver.findElement(By.xpath("//span[@class='sciop' and .='/']")).click();
		
		driver.findElement(By.xpath("//span[@class='scinm' and .='1']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		driver.findElement(By.xpath("//span[@class='scinm' and .='0']")).click();
		
		String result3= driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result3);
		
		
		
	}

}