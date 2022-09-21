package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rview1 
{
	
	
	public static void main(String[]args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.flipkart.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("samsung a50");
		   
		   driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
		   
		   Thread.sleep(2000);
		   
		   WebElement review = driver.findElement(By.xpath("((//span[contains(@class,'_2_R_DZ')])//span)"));
		   
		   System.out.println("Samsung Mobiles=="+review.getText());
	}

}
