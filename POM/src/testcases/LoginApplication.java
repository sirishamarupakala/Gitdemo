package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class LoginApplication {

	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	RediffLoginPage r=new RediffLoginPage(driver);
	r.EmailId().sendKeys("test");
	r.Pass().sendKeys("test");
	r.Login().click();
	r.Home().click();
	
	RediffHomePage h=new RediffHomePage(driver);
	h.Search().sendKeys("home");
	h.SearchBtn().click();
}
	
}
