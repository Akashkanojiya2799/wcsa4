package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib f = new Flib();
		int rc = f.rowCount(EXCEL_PATH, "invalidcreds");
		
		LoginPage lp = new LoginPage(driver);
		
		WebElement username = lp.getUsernameTB();
		WebElement password = lp.getPasswordTB();
		WebElement login = lp.getLoginButton();
		
		for (int i=1; i<=rc; i++)
		{
			String usr = f.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String pass = f.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			
			username.sendKeys(usr);
			password.sendKeys(pass);
			login.click();
			
			Thread.sleep(2000);
			username.clear();
		}	
		
	}

}
