package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestInvalidDataActiTime extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
	    bt.openBrowser();  //Open the Browser
	       Flib flib = new Flib();
	       int rc = flib.getRowCount("./data/TestDataAct1.xlsx","invalidcreds");
           for(int i=1;i<=rc;i++) {       
          String username = flib.readExceldata("./data/TestDataAct1.xlsx","invalidcreds",i,0);
          String passward = flib.readExceldata("./data/TestDataAct1.xlsx","invalidcreds",i,1);
           System.out.println(i);
         driver.findElement(By.name("username")).sendKeys(username);
         driver.findElement(By.name("pwd")).sendKeys(passward);
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).clear();
           }
        bt.closeBrowser();

	}

}
