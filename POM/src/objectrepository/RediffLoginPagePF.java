package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
	WebDriver driver;
	
	public  RediffLoginPagePF(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	/*
	 * By username=By.xpath("//input[@id='login1']"); By
	 * password=By.xpath("//input[@id='password']"); By
	 * login=By.xpath("//input[@name='proceed']"); By
	 * home=By.linkText("rediff.com");
	 */
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement login;
	
	@FindBy(linkText="rediff.com")
	WebElement home;
	
	
	
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement Pass()
	{
		return password;
	}
	public WebElement Login()
	{
		return login;
	}
	
	public WebElement Home()
	{
		return home;
	}

}
