import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sirisha";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[name=\"enter-name\"]")).sendKeys(name);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String a =driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("input[name=\"enter-name\"]")).sendKeys(name);
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		String b =driver.switchTo().alert().getText();
		System.out.println(b);
		driver.switchTo().alert().dismiss();
		
	}

}
