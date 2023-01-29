package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YTShortsNameAndViews {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='button-container'])[1]")).click();
		Thread.sleep(3000);
		List<WebElement> shorts1 = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
		Thread.sleep(3000);
		List<WebElement> shorts2 = driver.findElements(By.xpath("//ytd-video-meta-block[@class='grid style-scope ytd-rich-grid-slim-media byline-separated']")); 
		Thread.sleep(3000);
		
		for (WebElement shortName:shorts1)
		{
			String s = shortName.getText();
			System.out.println(s);
		}
		
		for (WebElement shortName2: shorts2)
		{
			String s2 = shortName2.getText();
			System.out.println(s2);
		}
	
		//or
		
//		for (int i=0; i<shorts1.size(); i++)
//		{
//			for (int j=0; j<shorts2.size(); j++)
//			{
//				if (i==j)
//				{
//					System.out.println(shorts1.get(i).getText());
//					System.out.println(shorts2.get(j).getText());
//				}
//			}
//		}		
	}
}
