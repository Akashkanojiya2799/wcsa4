package qsp;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/LENOVO/Desktop/multipleselect.html");
		
		WebElement dropDown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDown);
		
		List<WebElement> options = sel.getOptions();
		TreeSet t = new TreeSet();
		for (WebElement i : options)
		{
			 String text = i.getText();
			 t.add(text);
		}
		
		for (Object i : t)
		{
			System.out.println(i);
		}
	}
}
