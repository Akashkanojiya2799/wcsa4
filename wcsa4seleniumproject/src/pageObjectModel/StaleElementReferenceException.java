package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=15dkkz94d8vab");
		
		WebElement usr = driver.findElement(By.name("username"));
		usr.sendKeys("admin");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);              
		usr.sendKeys("admin");              //This line is responsible for throwing an exception because address of webelment is getting changed after refresh            
		
	}
}
