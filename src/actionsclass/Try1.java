package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Try1
{
     public static void main(String[]args) throws InterruptedException
     {
    	 
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
    	 
		   driver.get("https://www.facebook.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nitesh patil 1848");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("143shiva");
		   
		   WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		   
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(login).click().build().perform();
		   
		   Thread.sleep(5000);
		   
		   
		   
		   
		   
		   
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
