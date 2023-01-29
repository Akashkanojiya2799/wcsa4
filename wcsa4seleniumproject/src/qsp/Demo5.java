package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//div[@id='button-container'])[1]")).click();
		Thread.sleep(6000);
		List<WebElement> shorts1 = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
		Thread.sleep(6000);
		List<WebElement> shorts2 = driver.findElements(By.xpath("//ytd-video-meta-block[@class='grid style-scope ytd-rich-grid-slim-media byline-separated']"));
		Thread.sleep(6000);
		
		for (int i=0; i<shorts1.size(); i++)
		{
			for (int j=0; j<shorts2.size(); j++)
			{
				if (i==j)
				{
					System.out.println(shorts1.get(i).getText());
					System.out.println(shorts2.get(j).getText());
				}
			}
		}
	}
}

// get the names and views of the youtube shorts
