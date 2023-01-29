package TakesScreenShot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class EventFiring {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver dri = new EventFiringWebDriver(driver);
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dri.get("https://www.selenium.dev/downloads/");
		
		WebElement download = dri.findElement(By.xpath("//h1[.='Downloads']"));
		
		File src = download.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/scr3.jpg");
		Files.copy(src, dest);	
	}
}
