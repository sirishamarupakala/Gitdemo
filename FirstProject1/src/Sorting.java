import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> firstCollist= driver.findElements(By.xpath("//tr/td[2]"));
		ArrayList<String> orglist = new ArrayList<String>();
		
		for(int i= 0;i<2;i++)
		{
		driver.findElement(By.xpath("//b[text()='Veg/fruit name']")).click();
		}
		for(int i=0;i<firstCollist.size();i++)
		{
			orglist.add(firstCollist.get(i).getText());
		//System.out.println(firstCollist.get(i).getText());
		}
		
		ArrayList<String> copiedlist = new ArrayList<String>();
		for(int i=0;i<orglist.size();i++)
		{
			copiedlist.add(orglist.get(i));
		}
		
		for(String o : orglist )
			
		{
			System.out.println(o);
		}
		
		Collections.sort(copiedlist);
		
		
		System.out.println("-------------------------------------------------------------");
		
for(String c : orglist )
			
		{
			System.out.println(c);
		}
		
		Assert.assertTrue(copiedlist.equals(orglist));
		
		
		
		}
	
	
	
	
		
	}


