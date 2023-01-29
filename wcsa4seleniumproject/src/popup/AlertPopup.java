package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenium%20data/AlertPopup.html");
		
		driver.findElement(By.xpath("//button[.='Click me! ']")).click();
		Alert a = driver.switchTo().alert();
		
		// get the text of the alert
		String text = a.getText();
		System.out.println(text);
		
		// accept the alert
		Thread.sleep(3000);
		a.accept();
		
		// dismiss the alert
		//a.dismiss();
		
		//a.sendKeys("Handled");
	}
}
