package practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Rviewpop 
{

	public static void main(String[]args) throws InterruptedException, IOException
	{
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.flipkart.com/");
		   
		   Thread.sleep(2000);
		   
		   driver.manage().window().maximize();
		   
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
		   
		   WebElement text = driver.findElement(By.xpath("//div[contains(@class,'aMaAEs')]"));
		   
	       	System.out.println(text.getText());
	       	
	       	Thread.sleep(4000);
	       	
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        File dest=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\screens___book_jpg");
	        
	        FileHandler.copy(source, dest);
	       	
	       	Thread.sleep(2000);
	       	
	       	
	       	System.out.println("=======================================================================");
	       	
	       	
	       	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("one plus nord 2 mobile");
	       	
	          driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	          
	          Thread.sleep(2000);
	          
	          driver.findElement(By.xpath("//div[contains(@class,'_3pLy-c row')]")).click();
	          
	          Thread.sleep(1000);
	          
	         Set<String> id = driver.getWindowHandles();
	         
	         ArrayList<String>bct=new ArrayList<String>(id);
	         
	        String home = bct.get(0);
	       String xpage = bct.get(1);
	       String ypage= bct.get(2);
	       
	       
	       
	       
	       System.out.println(home);
	       System.out.println(xpage);
	       System.out.println(ypage);
	       
	       System.out.println("=====================================================================");
	       driver.switchTo().window(ypage);
	       
	       Thread.sleep(3000);
	       
	      WebElement mob = driver.findElement(By.xpath("//div[contains(@class,'aMaAEs')]"));
	      
	      Thread.sleep(4000);
	      
	       File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        File dest1=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\screens___mob_jpg");
	        
	        FileHandler.copy(source1, dest1);
	       
	      System.out.println(mob.getText());
	       
	      
	      Actions vct=new Actions(driver);
	      Thread.sleep(1000);
	      
	      WebElement main = driver.findElement(By.xpath("//div[contains(@class,'_3qX0zy')]"));
	      
	      vct.moveToElement(main).click().build().perform();
	      
	      Thread.sleep(4000);
	      
	       File source2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        File dest2=new File("C:\\Users\\Admin\\OneDrive\\Pictures\\screens___main_jpg");
	        
	        FileHandler.copy(source2, dest2);
	      
	      Thread.sleep(2000);
	      
	      System.out.println("=======================================================================");
	      
	      driver.quit();
	      

	}
	
	
}
