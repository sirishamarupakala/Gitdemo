package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTNG2 {
	@Parameters({"URL","APIKey/user"})
	@Test
	public void Login(String urlname,String user)
	{
		// TODO Auto-generated method stub

		System.out.println(urlname);
		System.out.println(user);
			Assert.assertTrue(false);
			
}
	
	@Test(timeOut=4000)
	public void WebHomeLogin()
	{
		
		System.out.println("WEB HOME");
				
	}
	
	@Test(dependsOnMethods= {"WebHomeLogin"})
	public void AppHomeLogin()
	{
	
		System.out.println("after test 2");
				
	}
	@Test(enabled=false)
	public void APIHomeLogin()
	{
		
		System.out.println("before suite 2");
			
	}
	
	
	
	
	
}
