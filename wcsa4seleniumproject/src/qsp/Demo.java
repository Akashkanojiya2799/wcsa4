package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		Options manage=driver.manage();
		Window window=manage.window();
		window.maximize();
		driver.get("https://www.ajio.com/s/clothing-4461-75481");	
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[.='Track Pants with Contrast Side Taping']/../div[3]/span[@class='price  ']")).getText();	
		System.out.println(text);
		
//		driver.get("https://olympics.com/");
//		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//		String text = driver.findElement(By.xpath("//span[.='Eliud KIPCHOGE']/ancestor::li[@class='b2p-list__item position-relative']/descendant::span[@class='result-medal result-medal--gold']")).getText();
//		System.out.println(text);
	}
}
//FluentWait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(40)).ignoring(NoSuchElementException.class);