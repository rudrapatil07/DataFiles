package listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yearlist {
	
	
	
	public static void main(String[]args) throws InterruptedException
	{
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		     
		     Thread.sleep(2000);
		     
		   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		   
		   
		   Select y=new Select(year);
		   
		  List<WebElement> monya = y.getOptions();
          TreeSet tr=new TreeSet();
		  
		  for(WebElement op:monya)
		  {
			  System.out.println(op.getText());
			  
			  tr.add(op.getText());
			  
			  
		  }
		   
           System.out.println("==========================================================================");
		
		System.out.println("=========================================treeset=====================================");
		
		
		for(Object xy:tr)
		{
			System.out.println(xy);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
