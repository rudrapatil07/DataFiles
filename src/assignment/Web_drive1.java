package assignment;

import org.openqa.selenium.chrome.ChromeDriver;


public class Web_drive1
{
    
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.javatpoint.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		String url=driver.getCurrentUrl();
		
		System.out.print(url);
		
		driver.navigate().back();
		
		driver.close();	
		
	}
	
}
