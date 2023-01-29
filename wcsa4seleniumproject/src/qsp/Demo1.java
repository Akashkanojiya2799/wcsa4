package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");    //handle the IllegelStateException
	    ChromeDriver driver = new ChromeDriver();                                       //to launch the chrome browser
	    Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
	    driver.findElement(By.xpath("//a[.='open a popup window']")).click();
	    Thread.sleep(2000);
	    driver.close();
	}
}

