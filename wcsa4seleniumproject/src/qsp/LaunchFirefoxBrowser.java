package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");    //handle the IllegelStateException
		FirefoxDriver driver = new FirefoxDriver();                                   // launching Firefox browser
		driver.manage().window().maximize();                                          // maximize the firefox window
		Thread.sleep(5000);                                                           // browser remain opens for 5 seconds
		driver.close();                                                               // close the browser 
	}
}
