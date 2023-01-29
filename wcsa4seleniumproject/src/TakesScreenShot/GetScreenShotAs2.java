package TakesScreenShot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class GetScreenShotAs2 {
		
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/downloads/");
		
		 File src = driver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./screenshot/screenshot2.jpg");
		 Files.copy(src, dest);
		
	}
}

