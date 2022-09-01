package robot;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement target = driver.findElement(By.xpath("//span[.='Downloads']"));
		     Actions act = new Actions(driver);
		     act.contextClick(target).perform();
		     
		         Robot robot = new Robot();
		          
		          for(int i=1;i<=6;i++)
		          {
		        	  robot.keyPress(KeyEvent.VK_DOWN); 
		        	  robot.keyRelease(KeyEvent.VK_DOWN);
		        	  Thread.sleep(2000);
		        	  
		        }
		          
		          robot.keyPress(KeyEvent.VK_ENTER); 
	        	  robot.keyRelease(KeyEvent.VK_ENTER);  
		        
		     }
		

	}


