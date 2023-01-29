package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=2p327gk8p6slo");
		WebElement username = driver.findElement(By.name("username"));
	 	WebElement pass = driver.findElement(By.name("pwd"));
	 	username.sendKeys("admin");
	 	pass.sendKeys("manager");
	 	Thread.sleep(5000);
	 	username.clear();
	 	Thread.sleep(5000);
	 	pass.clear();
		
	 	// and
	 	
//	 	driver.get("https://www.google.com/");
//		WebElement a = driver.findElement(By.name("q"));
//		a.sendKeys("java");
//		Thread.sleep(2000);
//		a.clear();
	}
}
