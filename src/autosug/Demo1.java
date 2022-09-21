package autosug;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
   
   public static void main(String[]args) throws InterruptedException
   {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.google.com/");
	   
	  
	   
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("one plus");
	   Thread.sleep(2000);
	   
	  List<WebElement> sugg = driver.findElements(By.xpath("//li[contains(@class,'sbct')]"));
	   
	   for(WebElement xy:sugg)	   
	   {
		   System.out.println(xy.getText());
	   }
	   
	   Thread.sleep(2000);
	   
	   driver.close();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
	
	
	
	
}
