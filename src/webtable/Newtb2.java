package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtb2

{
   public static void main(String[]args)
   {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Admin/OneDrive/Documents/html/tble.html");
		
		List<WebElement> table = driver.findElements(By.xpath("/html/body/table/tbody/tr/td"));
		
		int siz = table.size();
	   
	   System.out.println(siz);	   
	   
	   for(WebElement xy:table)
	   {
		   System.out.println(xy.getText()+" ||");
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
	
	
	
	
}
