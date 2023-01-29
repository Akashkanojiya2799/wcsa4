package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrom.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement orangeHrm =  driver.findElement(By.xpath("//img[@alt='orangehrm-logo']/parent::div[@class='orangehrm-login-logo']"));
		
		 Dimension dim = orangeHrm.getSize();
		 int height=dim.getHeight();
		 int width = dim.getWidth();
		 System.out.println(height);
		 System.out.println(width);
		
	}
}
