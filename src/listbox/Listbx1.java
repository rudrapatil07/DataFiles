package listbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbx1 {
	
	
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElementByXPath("//a[text()='Create New Account']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@name='firstname']").sendKeys("Nitesh");
		
	   Thread.sleep(1000);
	   
		driver.findElementByXPath("//input[@name='lastname']").sendKeys("Patil");
		
		//Thread.sleep(1000);
		
	//	driver.findElementByXPath("//input[@id='u_1l_g_4B']").sendKeys("rudra143patil@gmail.com");
		
		//Thread.sleep(1000);
		
		//driver.findElementByXPath("//input[@type='password']").sendKeys("12345nitesh");
		
	//	Thread.sleep(1000);
		
		WebElement day = driver.findElementByXPath("//select[@id='day']");
		
		Thread.sleep(1000);
		
		Select s=new Select(day);
		
		s.selectByVisibleText("2");
		
		WebElement month = driver.findElementByXPath("//option[text()='sep");
		
		Select m=new Select(month);                
		
	    m.selectByVisibleText("sep");
		
		WebElement year = driver.findElementByXPath("//option='year']");
		
		
		Thread.sleep(1000);
		Select Y=new Select(year);
		
		
		Y.selectByVisibleText("1995");
		
		driver.findElementByXPath("//label[text()='Male']").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//button[@type='submit']").click();
		
		Thread.sleep(200);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
