package datadriventesting2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginGeneralised {
	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");     use this for firefox browser
		FileInputStream fis = new FileInputStream("./data2/data.properties");
		Properties property = new Properties();
		property.load(fis);
		
		WebDriver driver = null;
		
		String browser = property.getProperty("Browser");
		
		switch(browser)
		{
			case "chrome": 
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println("Invalid browser");
				break;
		}
		
		driver.manage().window().maximize();
		driver.get(property.getProperty("url"));
		
		long time = Long.parseLong(property.getProperty("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		String usr = property.getProperty("Username");
		String pass = property.getProperty("Password");
		
		driver.findElement(By.id("username")).sendKeys(usr + Keys.TAB + pass + Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		if(status)
		{
			System.out.println("Home page displayed");
		}
		else
		{
			System.out.println("home page not found");
		}	
		driver.quit();
			
	}
}
