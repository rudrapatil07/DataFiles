package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 

{

	
	
	public static void main(String[]args) throws InterruptedException
	{
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://demoqa.com/alerts");
			
			Thread.sleep(2000);
			
			WebElement butt = driver.findElement(By.xpath("//button[text()='Click me']"));
			
			 butt.click();
			 Thread.sleep(2000);
			  
	         Alert alt = driver.switchTo().alert();		  
	         
	         
		      String dt = alt.getText();
		      System.out.println(dt);
		  
		         alt.accept();
		    
		    
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
