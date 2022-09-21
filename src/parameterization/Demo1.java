package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{


   public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException
   {
	   FileInputStream file=new FileInputStream("C:\\Users\\Admin\\OneDrive\\Documents\\html\\Uchiha.xlsx");
	    
	  Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet4");
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.amazon.in");
	   
	   Thread.sleep(2000);
	   
	   WebElement xx = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	   
	   xx.click();
	   
	   Thread.sleep(3000);
	   
	  WebElement id = driver.findElement(By.xpath("//input[@name='email']"));
	  
	  String Id = sheet.getRow(0).getCell(0).getStringCellValue();
	  
	  id.sendKeys(Id);
	  
	  WebElement bt = driver.findElement(By.xpath("//input[@id='continue']"));
	  
	  bt.click();
	   
	  Thread.sleep(2000);
	   
	   WebElement pas = driver.findElement(By.xpath("//input[@id='ap_password']"));
	   
	   String pass = sheet.getRow(0).getCell(1).getStringCellValue();
	   
	   pas.sendKeys(pass);
	  
	   
	  WebElement sig = driver.findElement(By.xpath("//input[@id='signInSubmit']")); 
	   
	   sig.click();
	   
	   
	   
	   
	//   driver.close();
	   
	   
	   
	   
	   
	   
   }
	
	
}
