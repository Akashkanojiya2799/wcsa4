package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.skillrary.com/");
		
		driver.findElement(By.xpath("//span[text()='GEARS']")).click();
		WebElement tab = driver.findElement(By.xpath("//div[@class='menu_container']/descendant::a[@class='ignorelink' and text()=' SkillRary Essay']"));
		tab.click();
		
		String parentID = driver.getWindowHandle();
		Set<String> windowIDs = driver.getWindowHandles();
		Thread.sleep(3000);
		for (String i: windowIDs)
		{
			driver.switchTo().window(i);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mytext']")).sendKeys("Akash");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='enterName()']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
