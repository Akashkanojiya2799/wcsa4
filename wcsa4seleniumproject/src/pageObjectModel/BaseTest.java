package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import KeyWordDrivenFrameWork.Flib;

public class BaseTest implements IAutoConstant {
	
	public static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		
		String browser = flib.readPropertyData(PROP_PATH, "Browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		
		if(browser.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		
		else if (browser.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		
		else
		{
			System.out.println("Enter the valid browser");
		}
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
