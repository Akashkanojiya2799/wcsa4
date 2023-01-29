package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demoapp.skillrary.com/index.php");
			
			WebElement course = driver.findElement(By.id("course"));
			Actions act = new Actions(driver);
			act.moveToElement(course).perform();
			
			
			driver.findElement(By.xpath("//span[@class='wrappers']/a[.='Selenium Training']")).click();
			WebElement add=driver.findElement(By.id("add"));
			Thread.sleep(2000);
			act.doubleClick(add).perform();
		
	}

}
