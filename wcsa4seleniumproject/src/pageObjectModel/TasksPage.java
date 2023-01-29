package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage extends BaseTest {
	
	@FindBy(xpath="(//td[@class='navItem relative'])[2]") private WebElement tasks;
	@FindBy(xpath="//a[.='Projects & Customers']") private WebElement projectAndCustomer;
	@FindBy(xpath="//input[@value='Create New Project']") private WebElement createProject;
	
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getTasks() {
		return tasks;
	}

	public WebElement getProjectAndCustomer() {
		return projectAndCustomer;
	}

	public WebElement getCreateProject() {
		return createProject;
	}
	
	
	public void createProject(int index) throws InterruptedException
	{
		tasks.click();
		Thread.sleep(2000);
		projectAndCustomer.click();
		Thread.sleep(2000);
		createProject.click();
		
		Thread.sleep(4000);
		WebElement customer = driver.findElement(By.name("customerId"));
		
		Select s = new Select(customer);
		s.selectByIndex(index);
		
		driver.findElement(By.name("name")).sendKeys("LOGIN PAGE UI");
		Thread.sleep(2000);
		driver.findElement(By.name("description")).sendKeys("Design a web application");
		Thread.sleep(2000);
		driver.findElement(By.name("createProjectSubmit")).click();
		
	}

}
