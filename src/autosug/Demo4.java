package autosug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 
{

	
	public static void main(String[]args) throws InterruptedException
	{
		 String king="samrat ashok history";

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://in.search.yahoo.com/?fr2=inr");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@name='p']")).sendKeys("Smarat Ashok");
		   
		   Thread.sleep(2000);
		   
		  List<WebElement> Emperor = driver.findElements(By.xpath("//li[contains(@role,'option')]"));
		  
		  for(WebElement ki:Emperor)
		  {
			  String RJ = ki.getText();
	          System.out.println(RJ);
			  
		     if(RJ.equals(king))
		     {
		    	ki.click();
		    	break;
		     }
					  
					  
					  
					  
					  
					  
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
