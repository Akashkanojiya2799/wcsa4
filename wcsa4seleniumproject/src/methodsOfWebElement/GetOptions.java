package methodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/LENOVO/Desktop/multipleselect.html");
		WebElement dropDown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDown);
		List<WebElement> options = sel.getOptions();
		for (int i=0 ; i<options.size() ; i++)
		{
			WebElement opt = options.get(i);
			System.out.println(opt.getText());
		}
	}
}
