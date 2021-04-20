import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Documents\\chromedriver.exe");//setting the path to .exe driver file that we download
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://www.facebook.com/");
		/*
		 * driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test");//With Xpathss
		 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("test");
		 * driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 */
		//With CSS
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();;
		
	
		
		
	}

	
}
