import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// creating driver object
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(10000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
////div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA'] without using index traversing through parent

	}

}
