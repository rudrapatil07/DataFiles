package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Try5 
{
   
	public static void main(String[]args) throws InterruptedException
	{
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0')]")).click();
		   
		   Thread.sleep(2000);
		   
		   WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		   
		   Thread.sleep(2000);
		   
		   Actions act=new Actions(driver);
		   
		   act.moveToElement(day).click().build().perform();
		   
		   Thread.sleep(2000);
		   
		   act.sendKeys(Keys.ARROW_UP).perform();
		   
		   
		   Thread.sleep(1000);
		   
		   act.sendKeys(Keys.ARROW_UP).perform();
		   
		   Thread.sleep(1000);
		   
		   act.sendKeys(Keys.ARROW_UP).perform();
		   
		   Thread.sleep(1000);
	   
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   
		   Thread.sleep(1000);
		   
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   
		   Thread.sleep(1000);
		   
		   act.sendKeys(Keys.ARROW_DOWN).perform();
		   
		   Thread.sleep(2000);
		   
		   act.sendKeys(Keys.ENTER).perform();
		
		   driver.close();
		   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
