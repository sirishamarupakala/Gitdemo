package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title =By.xpath("//h2[text()=\"Featured Courses\"]");
			
	By contact=By.xpath("//a[text()='Contact']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Login()
	{
		return driver.findElement(signin);
	}
	
	public WebElement GetTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement Contact()
	{
		return driver.findElement(contact);
	}
	

}
