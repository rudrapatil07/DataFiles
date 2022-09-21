package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monthlist {
	
	
	public static void main(String[]args) throws InterruptedException
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.facebook.com/");
	     
	     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	     
	     Thread.sleep(2000);
	     
	     
	     WebElement months = driver.findElement(By.xpath("//select[@id='month']"));
	     
	     Select M=new Select(months);
	     
	    List<WebElement> month = M.getOptions();
	    
	    int size=month.size();
	    
	    
	    System.out.println("the size of month=="+size);
	     
	     
	      List<WebElement> monya = M.getOptions();
	      
	      for(WebElement oj:monya)
	      {
	    	  System.out.println(oj.getText());
	      }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
