package assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI46qQwLej_AIV1H0rCh3c5gQHEAAYASAAEgLpR_D_BwE");
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement ring = driver.findElement(By.xpath("//a[.='Rings ']"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.moveToElement(ring).perform();
		driver.findElement(By.xpath("//a[text()='Diamond Rings']")).click();
		
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='new-price']"));
		for (WebElement e:prices)
		{
			System.out.println(e.getText());
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		
		WebElement sort = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
		act.moveToElement(sort).perform();
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		
		List<WebElement> sortedPrice = driver.findElements(By.xpath("//span[@class='new-price']"));
		System.out.println();
		System.out.println("After sorting the price of Diamond rings are");
		for(WebElement e: sortedPrice)
		{
			System.out.println(e.getText());
			Thread.sleep(1000);
		}
		driver.quit();
	}
}

//Assignment 1 Scenario 5
