package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo2 
{

	public static void main(String[]args) throws InterruptedException
	{
		
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 	
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]"));
		
		boolean res = button.isEnabled();

		System.out.println(res);
		
		//Assert.assertTrue(res, "Button is Enabled");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
