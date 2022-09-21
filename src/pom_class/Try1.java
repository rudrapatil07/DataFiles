package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try1 
{

     public static void main(String[]args) throws InterruptedException
     {
    	 
    	 
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   Facebook_login log=new  Facebook_login(driver);
		   
		   Thread.sleep(1000);
		   
		   log.setun();
		   Thread.sleep(1000);
		   
		   log.setpass();
		   
		   Thread.sleep(1000);
		   log.setbutt();
    	 
		   Thread.sleep(1000);	 
    	 
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
