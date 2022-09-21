package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Niketble 
{

	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/nike-revolution-5-running-shoes-men/p/itm11637de31a718?pid=SHOFK455XRYDPGHE&lid=LSTSHOFK455XRYDPGHEAFGEZT&marketplace=FLIPKART&q=nike+shoes&store=osp%2Fcil%2F1cu&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_2_1_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_1_na_na_na&fm=search-autosuggest&iid=df3663d4-a3cd-46a8-96df-2ddf8c61568e.SHOFK455XRYDPGHE.SEARCH&ppt=sp&ppn=sp&ssid=8794zm4mww0000001658236046699&qH=2d7d99166bc4a50f");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[contains(@class,'VgkY_D')]")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> headers = driver.findElements(By.xpath("//tr[contains(@class,'_2rYOwN')]"));
		
		int XX = headers.size();
		
		System.out.println(XX);
		
		for(WebElement op:headers)
		{
			System.out.print(op.getText()+"  ");
		}
		System.out.println();
		Thread.sleep(2000);
		List<WebElement> data = driver.findElements(By.xpath("//tr[contains(@class,'_1jcOew')]"));
		
		for(WebElement oj:data)
		{
			System.out.println("||  "+oj.getText()+"  ||");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
