package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddeDivisionPopup {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrom.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com");
		
		WebElement hiddenDivisionPopup = driver.findElement(By.xpath("//button[.='✕']"));
		hiddenDivisionPopup.click();
		
	}
}
