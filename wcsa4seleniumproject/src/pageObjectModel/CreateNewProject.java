package pageObjectModel;

import java.io.IOException;

public class CreateNewProject extends BaseTest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseTest bt =new BaseTest();
		bt.openBrowser();
		
		Flib f = new Flib();
		
		Thread.sleep(4000);
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(f.readPropertyData(PROP_PATH, "Username"), f.readPropertyData(PROP_PATH, "Password"));
		
		Thread.sleep(4000);
		TasksPage p = new TasksPage(driver);
		p.createProject(2);
		
	}
}
