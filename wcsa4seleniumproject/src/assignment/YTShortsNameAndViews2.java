package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YTShortsNameAndViews2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@id='button-container'])[1]")).click();
		Thread.sleep(4000);
		List<WebElement> shorts = driver.findElements(By.xpath("//ytd-rich-item-renderer[@class='style-scope ytd-rich-shelf-renderer' and (@is-reel-item-style-avatar-circle)]"));

		for (WebElement shortName : shorts) {
			String s = shortName.getText();
			System.out.println(s);
		}
	}
}
