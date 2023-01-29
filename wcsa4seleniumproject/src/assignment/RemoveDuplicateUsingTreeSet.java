package assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingTreeSet {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/LENOVO/Desktop/multipleselect.html");
		WebElement ele = driver.findElement(By.id("menu"));
		Select s = new Select(ele);
		
		List<WebElement> options = s.getOptions();
		TreeSet<String> t = new TreeSet<String>();
		
		for (WebElement opt:options)
		{
			String text = opt.getText();
			t.add(text);
		}
		
		for (String i:t)
		{
			System.out.println(i);
		}
	}
}
