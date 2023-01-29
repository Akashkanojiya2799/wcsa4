package pageObjectModel;

import java.io.IOException;

public class ActiTimeLogout extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib f= new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(f.readPropertyData(PROP_PATH, "Username"), f.readPropertyData(PROP_PATH, "Password"));
		
		Thread.sleep(6000);
		HomePage hp = new HomePage(driver);
		hp.logout();
	}
}
