package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usr = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("password"));
		usr.sendKeys("Admin");
		pass.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-')]"));
		login.click();
		Thread.sleep(5000);
		//driver.quit();
	}
}
