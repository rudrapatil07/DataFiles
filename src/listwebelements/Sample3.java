package listwebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
      public static void main(String[]args) throws InterruptedException
      {
    	  
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
  		
  		WebDriver driver=new ChromeDriver();
  		
  		driver.get("https://formstone.it/components/checkbox/");
  		
  		Thread.sleep(2000);
  		
  		driver.manage().window().maximize();
  		
  		Thread.sleep(2000);
  		
  		List<WebElement> checkbox = driver.findElements(By.xpath("//div[contains(@class,'fs-checkbox ')]"));
    	  
    	  int list = checkbox.size();
    	  
    	  System.out.println(list);
    	  
    	  
    	  for(int i=list-1;i>=0;i--)
    	  {
    		  WebElement check = checkbox.get(i);
    		  Thread.sleep(1000);
    		  check.click();
    	  }
    	  
    	  for(int i=0;i<=list-1;i++)
    	  {
    		  WebElement che = checkbox.get(i);
    		  Thread.sleep(1000);
    		  che.click();
    	  
    	  
    	  
    	  }
    	  
    	  
    	  
    	  
    	  
      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
