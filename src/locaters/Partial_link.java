package locaters;

import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_link {
	
	
	public static void main(String[]args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementByPartialLinkText("Forgotten pas").click();
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
