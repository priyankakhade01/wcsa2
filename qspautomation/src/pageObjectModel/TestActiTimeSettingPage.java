package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestActiTimeSettingPage {

       
	    @FindBy(name="username")private WebElement usn;
		@FindBy(name="pwd")private WebElement pass;
        @FindBy(id="loginButton")private WebElement loginButton;
        @FindBy(xpath="//div[text()='Settings']")private WebElement setting;
        
        
        
        
		public TestActiTimeSettingPage(WebDriver driver) {
		
			PageFactory.initElements(driver,this);
			
		}
		public WebElement getUsn() {
			return usn;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLoginButton() {
			return loginButton;
		}
		public WebElement getSetting() {
			return setting;
        
	} 
		
		//operational method
				public void validActiTimeSettingPage(String validUsername,String validPassward)
				{
					
					usn.sendKeys(validUsername);
					pass.sendKeys(validPassward);
					loginButton.click();
		
		
				}
}
