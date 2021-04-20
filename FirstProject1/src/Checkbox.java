import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(5000);
		WebElement c = driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]"));
		Assert.assertFalse(c.isSelected());
		//Assert.assertTrue(c.isSelected());
		System.out.println(c.isSelected());
		c.click();
		Assert.assertTrue(c.isSelected());
		System.out.println(c.isSelected());
		
		int i = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	    Assert.assertEquals(6, i);
		System.out.println(i);
		
		
	}

}
