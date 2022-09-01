package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
        //declaration
		@FindBy(name="username") private WebElement usn;
		@FindBy(name="pwd") private WebElement pass;
		@FindBy(id="loginButton") private WebElement loginButton;
		@FindBy(id="keepLoggedInCheckBox")private WebElement checkbox;
		@FindBy(xpath="//a[contains(text(),'Actimind Inc.')]")private WebElement linkActiTime;
		@FindBy(xpath="//a[contains(text(),'License')]")private WebElement lincenselink;
		@FindBy(xpath="//img[contains(@src,'timer')]")private WebElement logoActiTime;
		
		
    public LoginPage(WebDriver driver)
    {
	
    	PageFactory.initElements(driver, this);
     }
	//utilization
		public WebElement getUsn() {
			return usn;
		}
		
		
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLoginButton() {
			return loginButton;
		}
		public WebElement getCheckbox() {
			return checkbox;
		}
		public WebElement getLinkActiTime() {
			return linkActiTime;
		}
		public WebElement getLincenselink() {
			return lincenselink;
		}
		public WebElement getLogoActiTime() {
			return logoActiTime;
		}
		
		//operational method
		public void validLoginActitime(String validUsername,String validPassward)
		{
			
			usn.sendKeys(validUsername);
			pass.sendKeys(validPassward);
			loginButton.click();
		}
		
		public void invalidLoginActiTime(String invalidUsername,String invalidPassward) throws InterruptedException
		{
			usn.sendKeys(invalidUsername);
			pass.sendKeys(invalidPassward);
			loginButton.click();
			Thread.sleep(3000);
			usn.clear();
			
			
		}

	

}
