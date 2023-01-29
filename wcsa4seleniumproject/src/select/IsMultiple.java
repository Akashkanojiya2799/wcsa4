package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/LENOVO/Desktop/multipleselect.html");
		
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		
		if (sel.isMultiple())
		{
			sel.selectByIndex(0);
			Thread.sleep(3000);
			sel.selectByValue("v2");
			Thread.sleep(3000);
			sel.selectByVisibleText("Idli");
			Thread.sleep(3000);
			
			 List<WebElement> list = sel.getAllSelectedOptions();
			
			 for (WebElement ele : list)
			 {
				 System.out.println(ele.getText());
			 }
			 
			 sel.deselectByIndex(0);
			 Thread.sleep(3000);
			 sel.deselectByValue("v2");
			 Thread.sleep(3000);
			 sel.deselectByVisibleText("Idli");
		}
		else
		{
			System.out.println("It is single selected dropdown");
		}
	}

}
