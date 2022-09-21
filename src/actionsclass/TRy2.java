package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TRy2
{

	public static void main(String[]args) throws InterruptedException
	{
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
   	 
		   driver.get("https://www.instagram.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@aria-required='true']")).sendKeys("rudra_patil_7");
		   
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1495nitesh");
		
		   WebElement login = driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy ')]"));
		
		   Thread.sleep(5000);
		   
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(login).click().build().perform();
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
