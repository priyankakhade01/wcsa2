package KeywordDrivenFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestActiTimeDropdownOps extends BaseTest {

	

	

	public static void main(String[] args) throws IOException {
		
		        BaseTest bt = new BaseTest();
		        bt.openBrowser();
		        
		            Flib flib = new Flib();
		            
		              
				         String username = flib.readPropertyFile(PROP_PATH, "username");
				         String passward = flib.readPropertyFile(PROP_PATH, "passward");
		            
		            
		            
		            driver.findElement(By.name("username")).sendKeys(username);
		            driver.findElement(By.name("pwd")).sendKeys(passward);
		            driver.findElement(By.id("loginButton")).click();
		            driver.findElement(By.partialLinkText("Settings")).click();
		            
		            WebElement dropdown1 = driver.findElement(By.name("firstHierarchyLevelCode"));
		            
		            WebDriverCommonLib wb = new WebDriverCommonLib();
		            wb.getAllOptionsOfDropdown(dropdown1);
		            
		            System.out.println("________________________________");
		            
		            
		           WebElement dropdown2 = driver.findElement(By.name("secondHierarchyLevelCode"));
		           wb.getAllOptionsOfDropdown(dropdown2);
		            
		                 
		           //WebElement dd3 = driver.findElement(By.name("thirdHierarchyLevelCode"));
		                
                   // wb.getAllOptionsOfDropdown(dd3);
	}

}
