package POM;

import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SignUp {

	@FindBy(xpath="//strong[.='Sign Up']")
	private WebElement signup;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	private WebElement EmailAddress;
	
	@FindBy(xpath="	//input[@name='get_started']")
	private WebElement getStartedBtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwd;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwdConfirmationBtn;
	
	//input[@name='password_confirmation']
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueBtn;
	
	public void signUp_page(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void setSignUp(String email,String password) throws IOException {
		signup.click();
		 
		
		 EmailAddress.sendKeys(email);
		 getStartedBtn.click();
		
		 passwd.sendKeys(password);
		 passwdConfirmationBtn.sendKeys(password);
		 continueBtn.click();
		 
	}
	
	
	
	
	
	
	
}
