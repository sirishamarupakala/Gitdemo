import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Documents\\chromedriver.exe");//setting the path to .exe driver file that we download
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Already']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("test");
		driver.findElement(By.cssSelector("input#password")).sendKeys("test");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
	}

}
