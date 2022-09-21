package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Facebook_login
{

	@FindBy(xpath="//input[@name='email']")private WebElement Un; 
	
	@FindBy(xpath="//input[@name='pass']") private WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")private WebElement Bt;
	

	public Facebook_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setun()
	{
		Un.sendKeys("Nitesh patil 1848");
		
	}
	public void setpass()
	{
		pass.sendKeys("143shiva");
		
	}
	public void setbutt()
	{
		Bt.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
