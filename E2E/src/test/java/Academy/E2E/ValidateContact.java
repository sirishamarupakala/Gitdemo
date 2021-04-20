package Academy.E2E;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.base;

public class ValidateContact extends base {
	

	@BeforeTest
		public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}
	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		LandingPage lp=new LandingPage(driver);
		
		//Assert.assertEquals(lp.GetTitle().getText(),"FEATURED COURSES");
		Assert.assertTrue(lp.Contact().isDisplayed());
		
	}
@AfterTest
	
	public void closebrowser()
	{
		driver.close();
	}
	

}
