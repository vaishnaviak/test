package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_First_client {
	public WebDriver driver;

	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[1]/div[1]/div/input")
	private WebElement name;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[2]/div[1]/div[1]/input")
	private WebElement addressLine1;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[2]/div[2]/div/input")
	private WebElement addressline2;
	
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[3]/div[1]/div/input")
	private WebElement city;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[3]/div[2]/div/input")
	private WebElement state;
	
	//input[@name='password_confirmation']
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[4]/div[1]/div/input")
	private WebElement country;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div/div[2]/form/div[4]/div[2]/div/input")
	private WebElement zipcode;
	
	@FindBy(xpath="//div[@class='css-1hwfws3 react-select__value-container']")
	private WebElement dueterms;
	
	@FindBy(xpath="//input[@name='commit']")
	private WebElement continueBtn;
	
	
	
	
	
	
	
	public void create_First_Client_page(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	

	public void setFirst_Client(String nameofperson, String address1, String addrees2, String cityname,
			String statename, String countryname, String zipcod) {
		name.sendKeys(nameofperson);
		addressLine1.sendKeys(address1);
		addressline2.sendKeys(addrees2);
		city.sendKeys(cityname);
		state.sendKeys(statename);
		country.sendKeys(countryname);
		zipcode.sendKeys(zipcod);
		
		Select s=new Select(dueterms);
		s.selectByIndex(1);
		
		continueBtn.click();
		
	}
	
	
	
	
	
	
	
	
	

}
