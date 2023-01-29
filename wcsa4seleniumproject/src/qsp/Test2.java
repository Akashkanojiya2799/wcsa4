package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']/descendant::div[.='Core i7']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Brand']/ancestor::section[@class='_167Mu3 _2hbLCH']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//div[.='HP' and (@class='_4921Z t0pPfW')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Operating System']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Windows 10' and (@class='_4921Z t0pPfW')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='4★ & above' and (@class='_4921Z t0pPfW')]")).click();
		Thread.sleep(40000);
		String text = driver.findElement(By.xpath("//div[.='HP Chromebook Intel Core i7 11th Gen - (16 GB/1 TB SSD/Windows 10 Home) 14-dv0058TU Thin and Light Lap...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(text);
	}
}
