package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnDeselectFromMultiSelect {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/LENOVO/Desktop/multipleselect.html");
		
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select s= new Select(dropdown);
		
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByValue("v2");
			Thread.sleep(2000);
			s.selectByVisibleText("Idli");
			Thread.sleep(5000);
			
			List<WebElement> list = s.getAllSelectedOptions();
			for (WebElement ele : list)
			{
				System.out.println(ele.getText());
			}
			
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("v2");
			Thread.sleep(2000);
			s.deselectByVisibleText("Idli");		
		}
		else
		{
			System.out.println("It is a single select");
		}
	}
}
