import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		/*
		 * int i = 0; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++;
		 * }
		 */
		for (int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		String s =driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
		System.out.println(s);
		
		
		
		
		
		
	}

}
