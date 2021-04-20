package Academy.E2E;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.base;

public class HomePage extends base {

	@BeforeTest
		public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException, InterruptedException
	{
		
		
		LandingPage lp=new LandingPage(driver);
		lp.Login().click();
		Thread.sleep(3000);
		LoginPage log=new LoginPage(driver);
		log.Email().sendKeys(Username);
		log.Pass().sendKeys(Password);
		log.Loginbtn().click();
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	
	//row stands for num of sets of data
	//column stands for num of values per one test
	{
		Object[][] data = new Object[2][2];	
		data[0][0]="restricteduser@abc";
		data[0][1]="pass1";
		data[1][0]="unrestricteduser@abc";
		data[1][1]="pass2";
					
		return data;
	}
	
@AfterTest
	
	public void closebrowser()
	{
		driver.close();
	}

}
