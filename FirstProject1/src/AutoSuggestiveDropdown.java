import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		WebDriverWait w=new WebDriverWait(driver, 10);
		driver.get("https://www.makemytrip.com/");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Oneway']")));
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("HYD");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//p[text()='Hyderabad, India']")).click();
		
	}

}
