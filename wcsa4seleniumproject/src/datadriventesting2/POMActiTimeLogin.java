package datadriventesting2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActiTimeLogin {
	
	//Declaration of element
	
	@FindBy(className="atLogoImg") private WebElement Logo;
	@FindBy(name="username") private WebElement usernameTF;
	@FindBy(name="pwd") private WebElement passwordTF;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInLabel") private WebElement keepMeLoggedIn;
	@FindBy(id="toPasswordRecoveryPageLink") private WebElement forgotPassword;
	
	

	//initialization
	public POMActiTimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	
	
}
