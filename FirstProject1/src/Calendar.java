import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[contains(@name,'originStation1')])[1]")).click();
		
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='AIP'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'state-highlight')]")).click();
		
		String t=driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
		System.out.println(t);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		String h=driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
		
		if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"))
		{
			System.out.println("enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("disabled");
			Assert.assertTrue(false);
			
		}
		
		
		
		
		//boolean r =driver.findElement(By.xpath("//input[contains(@id,'mainContent_view_date2')]")).isEnabled();
		//Thread.sleep(3000);
		//System.out.println(r);
	}

}
