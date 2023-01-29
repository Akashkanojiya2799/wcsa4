package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=2o28al2mvcu0t");
		
		Flib f= new Flib();
		
		int rc=  f.rowCount("./data/ActitimeTestData.xlsx", "invalidcreds");
		
		for (int i=1; i<=rc; i++)
		{
			String username = f.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 0);
			String password = f.readExcelData("./data/ActitimeTestData.xlsx", "invalidcreds", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("username")).clear();
		}
	}
}
