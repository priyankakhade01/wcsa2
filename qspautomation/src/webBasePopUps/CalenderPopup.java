package webBasePopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[@class='px-1 plNew  flex flex-middle nmx-1 pb-1']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-relative homeCalender']")).click();
	}

}
