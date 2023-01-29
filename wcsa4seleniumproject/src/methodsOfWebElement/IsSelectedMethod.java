package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=1fvwlcswdw8y3");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean status1 = checkbox.isSelected();
		System.out.println(status1);
		checkbox.click();
		boolean status2 = checkbox.isSelected();
		System.out.println(status2);
	}
}
