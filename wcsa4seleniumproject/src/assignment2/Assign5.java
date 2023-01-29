package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("apple watches");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		driver.findElement(By.xpath("(//input[@aria-label='Apple Watch Series 7'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='40 mm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Apple']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='White']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='New' and (@class='cbx x-refine__multi-select-cbx')]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@class='s-item__title'])[1]")).getText();
		System.out.println(text);
		
	}
}
//Assignment 1 Scenario 4
