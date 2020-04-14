package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicDetails {
	

	@FindBy(xpath="//input[@name='user[first_name]")
	private WebElement firstnameBox;
	
	@FindBy(xpath="//input[@name='user[last_name]")
	private WebElement lastnameBox;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[5]/div/div/label/div[1]")
	private WebElement checkbox;
	
	
	@FindBy(xpath="//input[@name='commit']")
	private WebElement continueBtn;
	
	//input[@name='name']
	@FindBy(xpath="//input[@name='name']")
	private WebElement organizationName;
	
	@FindBy(xpath="//input[@name='commit']")
	private WebElement continueBtn2;
	
	
	public void basicDetails_page(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void setBasic_Details(String firstname,String lastname,String organization) throws IOException {
		
		 
		firstnameBox.sendKeys(firstname);
		
		lastnameBox.sendKeys(lastname);
		checkbox.click();
		continueBtn.click();
		organizationName.sendKeys(organization);
		continueBtn2.click();
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
