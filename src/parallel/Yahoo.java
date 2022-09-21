package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yahoo 
{

	@Test
	public void open_yahoo() throws InterruptedException
	{
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://in.search.yahoo.com/?fr2=inr");
			
		driver.manage().window().maximize();
				
		   Thread.sleep(5000);
		 
		    driver.close();
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
