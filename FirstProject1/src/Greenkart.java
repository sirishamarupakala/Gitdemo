import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w=new WebDriverWait(driver, 5);
		String[] itemsNeeded= {"Cucumber", "Brocolli","Beetroot"}; //declare an array
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(5000);
		//Greenkart g= new Greenkart();
		addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		String msg=driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(msg);
	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		List<WebElement> products=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<products.size();i++)
		{
			String veggie = products.get(i).getText();
			String[] veggie1 = veggie.split("-");
			String veggie2 = veggie1[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			int j=0;
			if (itemsNeededList.contains(veggie2))
			{
				
				List<WebElement> button=driver.findElements(By.xpath("//div[@class=\"product-action\"]/button"));
				button.get(i).click();
				j++;
				if (j==itemsNeeded.length)
					break;
							
			}
		}	
	}
	
	

}
