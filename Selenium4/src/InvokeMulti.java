import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMulti {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it =handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://www.rahulshettyacademy.com");
		Thread.sleep(3000);
		String title =driver.findElements(By.cssSelector("a[href*='courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindowId);
		WebElement name =driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(title);
		File file = name.getScreenshotAs(OutputType.FILE); // this will store in type file
		FileUtils.copyFile(file, new File("C:\\\\Users\\\\Ravi\\\\Downloads\\\\logo.png"));
		Thread.sleep(3000);
		//driver.quit();
		
		//get height and width:
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

}
}
