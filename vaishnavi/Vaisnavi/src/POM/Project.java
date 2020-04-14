package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Project {
	
	
	@FindBy(xpath="//a[contains(text(),'Projects')]")
	private WebElement projects;

	@FindBy(xpath="//select[@name='client_id']")
	private WebElement selectClient;
	
	@FindBy(xpath="//input[@name='project_name']")
	private WebElement projectName;
	
	@FindBy(xpath="//select[@name='billing_method']")
	private WebElement billingMethod;
	
	@FindBy(xpath="//div[@class='form-group col-4 mb-0 pl-0']//select[@class='form-control']")
	private WebElement teamMember;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
	private WebElement submitBtn2;
	
public void project_page(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void setProject(String project_name) throws IOException {
		projects.click();
		

		Select s=new Select(selectClient);
		s.selectByIndex(0);
		
		projectName.sendKeys(project_name);
		
		Select s2=new Select(billingMethod);
		s.selectByIndex(0);
		
		
		Select s3=new Select(teamMember);
		s.selectByIndex(0);
		
		
		
		submitBtn2.click();
		
	}
	
	
	
	
	

}
