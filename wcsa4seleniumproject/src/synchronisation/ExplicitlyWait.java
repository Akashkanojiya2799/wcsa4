package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=27l77xijhug37");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("admin");
		boolean status1 = wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		boolean status2 = wait.until(ExpectedConditions.urlContains("http://127.0.0.1/login.do;jsessionid=27l77xijhug37"));
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println(status1 + " and " + status2);
	}
}
