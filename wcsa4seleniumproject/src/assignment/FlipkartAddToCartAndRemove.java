package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCartAndRemove {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 13");
		driver.findElement(By.xpath("//input[@name='q']/following::button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[@data-id='MOBG6VF5ADKHKXFX']")).click();
		Thread.sleep(3000);
		
		Set<String> window = driver.getWindowHandles();
		for (String win:window)
		{
		 driver.switchTo().window(win);
		} 
		
		driver.findElement(By.xpath("//li[@id='swatch-0-color']//a[@class='kmlXmn']")).click();
		driver.findElement(By.xpath("//li[@id='swatch-2-storage']")).click();
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("410 111");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
		
	}
}
