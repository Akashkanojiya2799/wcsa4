package datadriventesting2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginscriptUsingPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data2/data.properties");
		Properties property = new Properties();
		property.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		long time = Long.parseLong(property.getProperty("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.get(property.getProperty("url"));
		
		driver .findElement(By.id("username")).sendKeys(property.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(property.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		
	}
}
