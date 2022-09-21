package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nomtable
{

	
	public static void main(String[]args)
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("file:///C:/Users/Admin/OneDrive/Documents/html/tble.html");
			
			List<WebElement> headers = driver.findElements(By.xpath("//th"));
		
		          int size = headers.size();
		  		List<WebElement> data = driver.findElements(By.xpath("/html/body/table/tbody/tr/td"));
		
		System.out.println(size);
		
		
		for(WebElement xy:headers)
		{
			System.out.print(xy.getText()+" ||");
			
		}
		System.out.print("  ");
		
		for(WebElement vx:data)
		{
			System.out.println(vx.getText()+" ||");
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
