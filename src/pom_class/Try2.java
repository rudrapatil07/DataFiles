package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try2 
{

	public static void main(String[]args) throws InterruptedException
	{
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   Account xy=new Account(driver);
		   
		   Thread.sleep(1000);
		   xy.acount();
		   
		   Thread.sleep(1000);
		   xy.setname();
		   
		   Thread.sleep(1000);
		   xy.lastname();
		   
		   Thread.sleep(1000);
		   xy.Mail();
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
