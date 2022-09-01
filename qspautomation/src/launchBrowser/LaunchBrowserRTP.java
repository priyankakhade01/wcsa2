package launchBrowser;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser name,chrome or firefox");
            String browserValue = sc.nextLine();
            
            if(browserValue.equalsIgnoreCase("Chrome"))
            {
            	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            	driver=new ChromeDriver();
            	driver.manage().window().maximize();
                driver.get("http://www.google.com");
                Thread.sleep(5000);
            }
            
            
            
            else if(browserValue.equalsIgnoreCase("firefox"))
            {
            	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
            	driver=new FirefoxDriver();
            	driver.manage().window().maximize();
            	driver.get("http://www.google.com");
                Thread.sleep(5000);
            }
            
            else
            {
            	System.out.println("type valid input");
            	
            }
            
            
	}

}
