package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Try8 {
	
	public static void main(String[]args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0')]")).click();
		   
		   Thread.sleep(2000);
		   
		   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		   
		   Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(year).click().build().perform();
		
		for(int i=1;i<=12;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		act.moveToElement(year).click().build().perform();
		
		for(int i=1;i<=10;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER).perform();
			
	}
}
