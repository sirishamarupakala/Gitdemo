package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email=By.name("email");
	By pass=By.id("user_password");
	By loginbtn=By.name("commit");
			
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Pass()
	{
		return driver.findElement(pass);
	}
	public WebElement Loginbtn()
	{
		return driver.findElement(loginbtn);
	}
	

}
