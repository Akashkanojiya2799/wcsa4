package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the browser:");
		String brows=s.next();
		
		if (brows.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
		}
		else if (brows.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);		
			driver.quit();
		}
		else
		{
			System.out.println("Enter the valid browser");
		}
	}
}
