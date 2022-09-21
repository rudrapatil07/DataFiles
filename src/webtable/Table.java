package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table 
{


	    public static void main(String[]args) throws InterruptedException
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		
			driver.get("file:///C:/Users/Admin/OneDrive/Documents/html/tble.html");
			
			Thread.sleep(2000);
			
			List<WebElement> data = driver.findElements(By.xpath("html/body/table/tbody/tr"));
			
		     for(WebElement xy:data)
		     {
		    	 System.out.println(xy.getText());
		    	 
		     }
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
