import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLoc {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		Thread.sleep(3000);
		//WebElement nameEdit = driver.findElement(By.cssSelector("[name='name']"));
		//String r =driver.findElement(withTagName("label").above(nameEdit)).getText();
		//System.out.println(r);
		//WebElement doB = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//driver.findElement(RelativeLocator.withTagName("input").below(doB)).sendKeys("08/05/2020");
		//WebElement ice= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		//driver.findElement(RelativeLocator.withTagName("input").toLeftOf(ice)).click();
		WebElement radio = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(radio)).getText());
		
	}
}
