package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrom.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/LENOVO/Desktop/multipleselect.html");
		WebElement dropdown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(2);
		Thread.sleep(2000);
	}
}
