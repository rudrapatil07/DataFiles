package mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{

	
         public static void main(String[]args) throws InterruptedException 
     {
	
		
        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     	 	
    		 WebDriver driver=new ChromeDriver();
    		 
    		 Thread.sleep(2000);
    		 driver.get("https://www.amazon.in");
    		 
    		 List<WebElement> listbox = driver.findElements(By.xpath("//select[@id='searchDropdownBox']"));
    		 
    		 
    		 
    		 
             for(WebElement vv:listbox)
             {
            	String np = vv.getText();
            	 System.out.println(np);
             }
    		 
             
             Thread.sleep(1000);
             
             driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
