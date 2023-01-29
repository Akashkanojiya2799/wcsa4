package javaScriptExecutorMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentIsEnabled {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/LENOVO/Desktop/Selenium%20data/disabledelement.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement usr = driver.findElement(By.xpath("//input[@id='i1']"));
		WebElement pass = driver.findElement(By.id("i2"));
	
		if (usr.isEnabled())
		{
			usr.sendKeys("admin");
			System.out.println("From if block of usr");
		}
		else
		{
			js.executeScript("document.getElementById('i1').value='admin';");
			System.out.println("From else block of usr");
		}
		
		if(pass.isEnabled())
		{
			pass.sendKeys("manager");
			System.out.println("From if block of pass");
		}
		else
		{
			js.executeScript("document.getElementById('i2').value='manager';");
			System.out.println("From else block of pass");
		}
	}

}
