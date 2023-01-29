package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[class = '_2IX_2- VJZDxU']")).sendKeys("9766819094");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class ='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Akash@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class ='_2KpZ6l _2HKlqd _3AWRsL']")).click();	
		Thread.sleep(4000);
		driver.close();	
	}
}
