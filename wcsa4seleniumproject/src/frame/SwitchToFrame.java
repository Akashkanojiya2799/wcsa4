package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenium%20data/frame.html");
		
		WebElement frame = driver.findElement(By.id("frid"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("id1")).sendKeys("admin");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("id2")).sendKeys("manager");
		
	}

}
