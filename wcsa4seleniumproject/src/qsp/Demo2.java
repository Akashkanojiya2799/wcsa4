package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("bella");        //contains using unique attribute
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();                                 //contains using text()
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@id='video-title' and (@title='Bella - Tu Tera Dekh (Official Video) Found Out Records')]")).click();	   //contains using unique attribute
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();                                 //contains using text()
			Thread.sleep(2000);
	}
}


