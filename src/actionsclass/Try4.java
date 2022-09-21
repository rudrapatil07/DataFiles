package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Try4 
{

	public static void main(String[]args) throws InterruptedException
	{
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
       
		   driver.get("https://demo.guru99.com/test/drag_drop.html");
		   
		   Thread.sleep(2000);
		   
		   WebElement source = driver.findElement(By.xpath("//li[@data-id='5']"));
		 
		   WebElement dest = driver.findElement(By.xpath("//ol[contains(@class,'field14 ui-dr')]"));
		   
		   Thread.sleep(2000);
		   
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		
		
		///act.dragAndDrop(source, dest).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
