package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReaderClass {
	
	
	public static String readFile(String key) throws IOException {
		
		 File f=new File("D:\\DemoProject\\Vaisnavi\\src\\resources\\CommanData.properties");
	        FileInputStream fi= new FileInputStream(f);
	        Properties pr= new Properties();
	        pr.load(fi);
	       String data=pr.getProperty(key);
	       return data;
		
	}
	
	
	
	

}
