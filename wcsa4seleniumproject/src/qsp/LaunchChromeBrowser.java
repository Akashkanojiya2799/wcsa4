package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);                                               //for taking user input
		System.out.println("Enter the browser");
		String browservalue=sc.next();
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid IllegelstateException
			WebDriver driver = new ChromeDriver();                                         //Launch the chrome browser
			driver.manage().window().maximize();                                           //to maximize the browser window
			driver.get("https://www.facebook.com/");                                       //to open a web application
			Thread.sleep(4000);                                                            //to provide delay of 4 sec to script
			driver.close();                                                                //to close the browser
		}
		else if (browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");     //to avoid IllegelstateException
			WebDriver driver = new FirefoxDriver();                                        //launch the chrome browser
			driver.manage().window().maximize();                                           //to maximize the browser window
			driver.get("https://www.facebook.com/");                                       //to open a web application
			Thread.sleep(4000);                                                            //to provide the delay of 4 sec to script
			driver.close();                                                                //to close the browser
		}
		else
		{
			System.out.println("Enter valid browser");
		}
	}
}
