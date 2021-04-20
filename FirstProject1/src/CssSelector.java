import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Ravi\\\\Documents\\\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		d.get("https://login.salesforce.com/");
		d.findElement(By.cssSelector("[type='email']")).sendKeys("test");
		d.findElement(By.cssSelector("[id='password']")).sendKeys("test");
		d.findElement(By.xpath("//input[@id='Login']")).click();
		
	}

}
