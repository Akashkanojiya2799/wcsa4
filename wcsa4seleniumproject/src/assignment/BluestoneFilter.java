package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneFilter {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		WebElement watch = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(watch).perform();
		driver.findElement(By.xpath("//a[.='Band']")).click();
		Thread.sleep(2000);
		
		WebElement target = driver.findElement(By.xpath("//div[.='Filter by']"));
		act.doubleClick(target).perform();
		//act.moveToElement(target);
//		for(int i=0; i<2; i++)
//		{
//			 act.clickAndHold(target);
//		}
		Thread.sleep(2000);
		Robot r = new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']"));
		act.moveToElement(search).perform();
		//act.moveToElement(search).perform();
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	}

}
