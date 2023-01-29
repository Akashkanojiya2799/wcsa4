package getWindowHandleMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwndowHandle5 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentTitle = driver.getTitle();
		Set<String> parentChild = driver.getWindowHandles();
		
		for(String i : parentChild)
		{
			String currentTitle = driver.switchTo().window(i).getTitle();
			System.out.println(i);
			
			if(!parentTitle.equals(currentTitle))
			{
				driver.manage().window().maximize();
			}
		}
	}
}
//Perform maximize operation in child browser