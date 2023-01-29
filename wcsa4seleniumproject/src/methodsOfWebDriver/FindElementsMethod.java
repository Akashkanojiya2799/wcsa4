package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for (int i=0; i<suggestions.size(); i++)
		{
			WebElement suggestion = suggestions.get(i);
			String text = suggestion.getText();
			Thread.sleep(2000);
			System.out.println(text);                          //or System.out.println(suggestions.get(i).getText());
		}
		
//or
		
//		for (WebElement suggest:suggestions)
//		{
//			String s = suggest.getText();
//			Thread.sleep(2000);
//			System.out.println(s);
//		}
	}
}
