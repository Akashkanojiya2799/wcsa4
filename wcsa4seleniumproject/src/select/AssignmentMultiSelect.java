package select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentMultiSelect {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapp.skillrary.com/");

		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		System.out.println(s.isMultiple());

		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("99");
		Thread.sleep(2000);
		s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");

		List<WebElement> list = s.getAllSelectedOptions();

		for (WebElement ele : list) {
			System.out.println(ele.getText());
		}

		System.out.println(s.getFirstSelectedOption().getText());
	}

}
