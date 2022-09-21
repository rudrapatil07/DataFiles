package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Daylist {
	
	
	
	public static void main(String[]args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
	     
	     
	     driver.get("https://www.facebook.com/");
	     
	     
	     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	     
	     Thread.sleep(2000);
	     
	     
	     WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	     
	    Select D=new Select(day);
	    
	       List<WebElement> monya = D.getOptions();
	       
	       for(int i=0;i<=monya.size()-1;i++)
	       {
	    	  WebElement text = monya.get(i);
	    	   
	    	   System.out.println(text.getText());
	    	 
	       }
	       
	       driver.close();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
