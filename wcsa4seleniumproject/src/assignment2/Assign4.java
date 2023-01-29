package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/droppable/");

		Actions act = new Actions(driver);
		WebElement w = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(w);
		
		WebElement src = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		act.dragAndDrop(src, target).perform();
	}
}

//Assignment 1 Scenario 3
