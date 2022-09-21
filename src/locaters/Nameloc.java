package locaters;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nameloc {
	
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElementByName("email").sendKeys("patil95smailbox@rediffmail.com");
		
		driver.findElementByName("pass").sendKeys("143shiva");
		
		
		driver.findElementByName("login").click();
		 
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
