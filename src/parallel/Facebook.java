package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook 

{
     @Test
	public void Facebook_op() throws InterruptedException
	{

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
		   Thread.sleep(8000);
		 
		    driver.close();
			
	}
	
	
	
	
	
	
	
	
	
	
	
}
