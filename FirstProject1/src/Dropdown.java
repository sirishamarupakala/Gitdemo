import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		//Can only be used when the web element has select tag(Static drop down)
		Select s = new Select(driver.findElement(By.xpath("//select[contains(@name,'DropDownListCurrency')]")));
		s.selectByIndex(0);	
		s.selectByValue("INR");
		s.selectByVisibleText("AED");
	}

}
