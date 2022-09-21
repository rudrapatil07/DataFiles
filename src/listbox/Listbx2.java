package listbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbx2 {
	
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		
		driver.findElementByXPath("//a[text()='Create New Account']").click();
		
		Thread.sleep(2000);
		
	    WebElement day = driver.findElementByXPath("//select[@id='day']");
		
		Thread.sleep(1000);
		
		Select s=new Select(day);
		
		s.selectByVisibleText("2");
		
		
		WebElement month = driver.findElementByXPath("//select[@name='birthday_month']");
		
		Thread.sleep(1000);
		
		Select m=new Select(month);
	
		m.selectByValue("9");
		
		
		WebElement year = driver.findElementByXPath("//select[@name='birthday_year']");
		
		Thread.sleep(1000);
		
		Select y=new Select(year);
		
		y.selectByValue("1995");
		
		
	     boolean verifylistbox = s.isMultiple();
		
          boolean  verifylistbox1 = m.isMultiple();
          
          boolean verifylistbox2 = y.isMultiple();
          
          
          System.out.println("verifylistbox of day=="+verifylistbox);
          
          System.out.println("verfiylistbox of month=="+verifylistbox1);
          
          System.out.println("verifylistbox of year=="+verifylistbox2);
          
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
