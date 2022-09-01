package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    //declaration
		@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropDown;
		@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createNewTaskLink;
		@FindBy(id="SubmitTTButton")private WebElement saveLeaveTimeButton;
		@FindBy(xpath="//a[text()='Logout']")private WebElement logOutLink;
		
		
		//Initialization
		public HomePage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getEnterTimeTrackDropDown() {
			return enterTimeTrackDropDown;
		}
		public WebElement getCreateNewTaskLink() {
			return createNewTaskLink;
		}
		public WebElement getSaveLeaveTimeButton() {
			return saveLeaveTimeButton;
		}
		public WebElement getLogOutLink() {
			return logOutLink;
		}
		
		//Operational method
	public void logoutActitime()
	{
		logOutLink.click();
	}
		
		
		

	

}
