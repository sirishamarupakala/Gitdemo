package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	
	public  RediffHomePage(WebDriver driver)
	{
	this.driver=driver;
	}
	
	By search=By.id("srchword");
	By searchbtn=By.className("newsrchbtn");

	public WebElement Search()
	{
		return driver.findElement(search);
	}
	public WebElement SearchBtn()
	{
		return driver.findElement(searchbtn);
	}
	
}
