package frame;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealSwitchToFrame {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.snapdeal.com/");
		WebElement signin = driver.findElement(By.xpath("//span[.='Sign In']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(signin).perform();
		
		driver.findElement(By.xpath("//a[.='login']")).click();
		Thread.sleep(4000);
		WebElement f = driver.findElement(By.xpath("//iframe[@id='loginIframe' and @name='iframeLogin']"));
		driver.switchTo().frame(f);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='userName' and @name='username']")).sendKeys("1234567890");
		Thread.sleep(4000);
		driver.findElement(By.id("close-pop")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("toys");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		driver.quit();
		
	}

}
