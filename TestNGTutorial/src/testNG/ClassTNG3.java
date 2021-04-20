package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTNG3 {
@BeforeClass
public void WebHome1Login()
{

	System.out.println("before class 3");
			
}
	
	@AfterMethod
	public void WebHomeLogin()
	{
	
		System.out.println("after method 3");
				
	}
	@AfterClass
	public void WebHome3Login()
	{
	
		System.out.println("after class 3");
				
	}
	
	
	
	@Test(groups={"Smoke"})
	public void WebbikeLogin()
	{
		
		System.out.println("API CAR");
			
	}
	
	@BeforeMethod
	public void WebCarLogin()
	{
		
		System.out.println("before method 3");
				
	}
	
	
}
