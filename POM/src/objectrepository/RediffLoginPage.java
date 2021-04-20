package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	public  RediffLoginPage(WebDriver driver)
	{
	this.driver=driver;
	}
	
	By username=By.xpath("//input[@id='login1']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@name='proceed']");
	By home=By.linkText("rediff.com");
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	
	public WebElement Pass()
	{
		return driver.findElement(password);
	}
	public WebElement Login()
	{
		return driver.findElement(login);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}

}
