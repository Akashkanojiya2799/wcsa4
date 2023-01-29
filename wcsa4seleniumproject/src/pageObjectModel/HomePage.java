package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeButton;
	@FindBy(xpath="//div[.='Users']") private WebElement users;
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropdown;
	
	
	//initialization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}


	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}


	public WebElement getUsers() {
		return users;
	}


	public WebElement getEnterTimeTrackDropdown() {
		return enterTimeTrackDropdown;
	}
	
	
	
	
	// Operational methods
	
	public void logout()
	{
		logoutLink.click();
	}
	
	public void clickOnUsers()
	{
		users.click();
	}
	
	public void clickOnSaveLeaveTime()
	{
		saveLeaveTimeButton.click();
	}

	public void selectUser(int index)
	{
		Select s = new Select(enterTimeTrackDropdown);
		s.selectByIndex(index);
	}
}
