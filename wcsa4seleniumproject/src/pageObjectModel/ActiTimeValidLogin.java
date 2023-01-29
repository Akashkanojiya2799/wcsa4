package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib f = new Flib();
		String usr = f.readPropertyData(PROP_PATH, "Username");
		String pass = f.readPropertyData(PROP_PATH, "Password");
		
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(usr, pass);
		
		Thread.sleep(3000);
		bt.closeBrowser();
	}
}
