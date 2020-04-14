package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.BasicDetails;
import POM.Create_First_client;
import POM.Project;
import POM.SignUp;


public class testcase {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();

		 File f=new File("./src/resources/CommanData.properties");
	        FileInputStream fi= new FileInputStream(f);
	        Properties pr= new Properties();
	        pr.load(fi);
	       String url=pr.getProperty("URL");
	       
	       System.out.println(url);

	       driver.get(url);
	       String passwd=pr.getProperty("password");
    
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.manage().window().maximize();
          final String randomEmail = randomEmail();
       
        // sign up
         SignUp sg=new SignUp();
         sg.setSignUp(randomEmail,passwd);
     
      // Entering Basic details
         BasicDetails bs=new BasicDetails() ;
         bs.setBasic_Details("vaishnavi","KA","qspider");
         
       //Create First Clinet
         
         
         Create_First_client crf= new Create_First_client();
         crf.setFirst_Client("vaushnavi", "kannur", "kerala", "kannur", "kerala", "india", "56789");
        
         
         driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
         
         // creating project
         
         Project pr1=new Project();
         pr1.setProject("my project");
         
         Thread.sleep(8000);
        
        driver.quit();
    }

	// this method is to create random id for each mail
    private static String randomEmail() {
        return "random" + UUID.randomUUID().toString() + "@example.com";
      
    }

	
	
	
	
}
