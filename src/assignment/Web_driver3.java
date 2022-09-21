package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver3
{
    public static void main(String[]args) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe" );
    	
    	ChromeDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.google.com/");
    	
    	String title=driver.getTitle();
    	
    	System.out.println(title);
    	
    	String url=driver.getCurrentUrl();
    	
    	System.out.println(url);
    	
    	driver.navigate().to("https://www.facebook.com/");
    	
    	Thread.sleep(2000);
    	
    	driver.navigate().back();
    	
    	Thread.sleep(2000);
    	
    	Dimension d=new Dimension(200,400);
    	
    	driver.manage().window().setSize(d);
    	
    	Thread.sleep(3000);
    	
    	Point p=new Point(100,500);
    	
    	driver.manage().window().setPosition(p);
    	
    	driver.navigate().to("https://www.facebook.com/");
    	
    	driver.navigate().refresh();
    	
    	Thread.sleep(2000);
    	
    	driver.close();
    }
}
