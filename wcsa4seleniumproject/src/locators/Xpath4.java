package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Abcdefgh");        //contains using unique attribute
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456789");       //contains using unique attribute
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();	//contains using text()
		Thread.sleep(4000);
	}
}
// xpath by using contains --> 1.contains by using unique attribute
//                             2.conatins by using text()