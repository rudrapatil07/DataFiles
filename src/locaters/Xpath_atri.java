package locaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_atri {
	
   public static void main(String[]args)
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	   ChromeDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	   WebElement un = driver.findElementByXPath("//input[@name='email']");
	   
	   un.sendKeys("patil95smailbox@rediffmail.com");
	   
	   WebElement xy = driver.findElementByXPath("//input[@id='pass']");
	  
	   xy.sendKeys("143shiva");
	   
	   WebElement zz = driver.findElementByXPath("//button[@type='submit']");
	   
	   zz.click();
	   
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
