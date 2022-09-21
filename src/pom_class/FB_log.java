package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_log 
{

	@FindBy(xpath="//input[@name='email']")private WebElement Id;
	
	@FindBy(xpath="//input[@name='pass']") private WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")private WebElement bt;
	
	FB_log(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void setId(String name)
	{
		Id.sendKeys(name);
		
	}
	
	public void setpass(String Pass)
	{
		pass.sendKeys(Pass);
		
	}
	public void Clikbt()
	{
		bt.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
