package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[class = '_aa4b _add6 _ac4d']")).sendKeys("abcdefgh");     // or driver.findElement(By.name("username")).sendKeys("abcdgjdhn");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name ='password']")).sendKeys("123456789");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class = '_acan _acap _acas']")).click();
	}
}
