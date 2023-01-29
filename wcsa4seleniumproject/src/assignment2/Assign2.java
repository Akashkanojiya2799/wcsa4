package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		WebElement allJewellary = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(allJewellary).perform(); 
		driver.findElement(By.xpath("//a[.='Kadas']")).click();
		driver.findElement(By.xpath("//a[@id='pid_76911']/parent::div")).click();
		driver .switchTo().activeElement();
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
	}
}

// Assignment 1 Scenario 6