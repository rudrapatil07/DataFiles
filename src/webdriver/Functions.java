package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Functions
{

	public static void main(String[]args) throws Exception
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		
	  
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		
		driver.quit();
		
		driver.close();
	}
	
}
