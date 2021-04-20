package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassTNG1 {

	
	@Test(dataProvider= "getData")
	public void Demo1(String usrname, String pass)
	{
		// TODO Auto-generated method stub

		System.out.println(usrname);
		System.out.println(pass);
			
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		//3 is number of rows of data we are passing
		//2 is number of values
		
	Object[][] data = new Object[3][2];	
	data[0][0]="user id";
	data[0][1]="pass word";
	data[1][0]="sirisha";
	data[1][1]="pass1";
	data[2][0]="ravali";
	data[2][1]="pass2";
	return data;
	
}
}
