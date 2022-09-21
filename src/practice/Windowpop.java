package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpop
{

	public static void main(String[]args) throws InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.meesho.com/");
		
		Thread.sleep(5000);
		
	   driver.findElement(By.xpath("//span[contains(text(),'Download App')]")).click();
		
	   Thread.sleep(2000);
     
	   Set<String> Id = driver.getWindowHandles();
	
	   ArrayList<String>windows=new ArrayList<String>(Id);
	
       Iterator<String> it = windows.iterator();
 	
        String parent= it.next();
   
       System.out.println("your first page is="+parent);
   
           String child = it.next();
   
         System.out.println("your 2nd page="+child);
         
         driver.switchTo().window(child);
         
          String title1 = driver.getTitle();
          
          System.out.println(title1);
          
          Thread.sleep(3000);
          
          driver.switchTo().window(parent);
          
          Thread.sleep(2000);
          
          driver.close();
          
          
          
          
          
          
  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
