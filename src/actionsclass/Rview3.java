package actionsclass;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rview3 
{

	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.flipkart.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mrutunjay kadambari marathi");
		   
		   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		   
		   Thread.sleep(4000);
		
		   driver.findElement(By.xpath("//div[contains(@class,'_4ddWXP')]")).click();
		   
		   Thread.sleep(3000);
		   
		   Set<String> tab = driver.getWindowHandles();
		   
		   ArrayList<String> act=new ArrayList<String>(tab);
		   
		   String homep = act.get(0);
		   String cpage = act.get(1);
		   
		   System.out.println("===============================================");
		   
		   System.out.println(homep);
		   System.out.println(cpage);
		   
		   System.out.println("===============================================");
		   
		   driver.switchTo().window(cpage);
		   
		   Thread.sleep(1000);
		   
		   WebElement text = driver.findElement(By.xpath("//div[contains(@class,'_1YokD2')]"));
		   
	       	System.out.println(text.getText());
	       	
	       	Thread.sleep(2000);
	       	
	       	driver.switchTo().window(cpage).close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
