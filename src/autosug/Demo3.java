package autosug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	
	public static void main(String[]args) throws InterruptedException
	{
		
		
		String ex="apj kalam biography";
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://in.search.yahoo.com/?fr2=inr");
		      
		   Thread.sleep(4000);
		   
		   driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("APJ.kalam");
		   
		   Thread.sleep(2000);
		
		   List<WebElement> sir = driver.findElements(By.xpath("//li[@role='option']"));
		   
		   
		   for(WebElement xy:sir)
		   {
			  String act = xy.getText();
			  System.out.println(act);
			  
			  if(act.equals(ex))
			  {
				  xy.click();
				  break;
			  }
			  
		   }
		   
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
