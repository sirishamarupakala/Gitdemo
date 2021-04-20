import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Documents\\chromedriver.exe");//setting the path to .exe driver file that we download
			WebDriver driver=new ChromeDriver();//creating driver object
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys("hello");;
			driver.findElement(By.name("pw")).sendKeys("12345");;
			//driver.findElement(By.className("button r4 wide primary")).click(); gives compound class not permitted error
			driver.findElement(By.xpath("//*[@id='Login']")).click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
			
			
			
			}

}
