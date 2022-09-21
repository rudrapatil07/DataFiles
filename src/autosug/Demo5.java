package autosug;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[]args) throws InterruptedException
	{
		
		
		   String data = "chatrapati shivaji maharaj forts";
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   Scanner S=new Scanner(System.in);
		   
		   driver.get("https://in.search.yahoo.com/?fr2=inr");
		   
		   Thread.sleep(2000);
		   
		  driver.findElement(By.xpath("//input[@name='p']")).sendKeys("Chatrapati Shivaji Maharaj");
		   
		   Thread.sleep(5000);
		   
		   
		 List<WebElement> raje = driver.findElements(By.xpath("//li[contains(@role,'option')]"));
		
		 Thread.sleep(4000);
		
		for(WebElement Rj:raje)
		{
			String xy = Rj.getText();
			System.out.println(xy);
			
			if(xy.equals(data)) 
			{
			  Rj.click();
			  break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
