package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Flog%2Fs%3Fk%3Dlog%2Bin%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class = 'a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("7020288179");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class = 'a-button-input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class = 'a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class = 'a-button-input']")).click();
	}
}
