package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement watch = driver.findElement(By.xpath("//a[@id='course']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(watch).perform();
		driver.findElement(By.xpath("//span[@class='wrappers']/child::a[.='Cucumber']")).click();	
	}

}
