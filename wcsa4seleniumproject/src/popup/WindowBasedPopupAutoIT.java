package popup;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowBasedPopupAutoIT {
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=2jmjipwbcqy46");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement choose = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		act.click(choose).perform();
		Thread.sleep(5000);
		
		File f = new File("./autoIT/Auto2.exe");
		String path = f.getAbsolutePath();
		Runtime.getRuntime().exec(path);
		
		//or
		//Runtime.getRuntime().exec("C:\\Users\\LENOVO\\Desktop\\Selenium data\\Auto2.exe");
	}
}
