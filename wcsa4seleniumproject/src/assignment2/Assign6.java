package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign6 {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=6bd8hm79c70a7");
	
	WebElement usr = driver.findElement(By.name("username"));
	boolean check = wait.until(ExpectedConditions.titleContains("Login"));
	System.out.println(check);
	
	}
}
