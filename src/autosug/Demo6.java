package autosug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 
{

	public static void main(String[]args) throws InterruptedException
	{
		
		   String exp = "samrat ashok birth date";
		
		   System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\ADMIN\\Documents\\webdrivers\\chromedriver_win32 (1)\\chromedriver.exe\\");  
			
			WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.google.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samarat Ashoka");
		   Thread.sleep(4000);
		   List<WebElement> sugg = driver.findElements(By.xpath("//li[contains(@class,'sbct')]"));
		   
		   Thread.sleep(2000);
		   
		   for(WebElement xy:sugg)
		   {
			  String act = xy.getText();
			  System.out.println(act);
			  
			  if(act.equals(exp))
			  {
				  xy.click();
				  break;

			  }  
		   }
		   Thread.sleep(2000);
		   driver.close();
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
