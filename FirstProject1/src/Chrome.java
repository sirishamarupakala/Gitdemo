import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create Driver object for chrome
		/*class name = ChromeDriver
		 * X driver=new X(); usual object creation syntax for a class
		 */
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Documents\\chromedriver.exe");//setting the path to .exe driver file that we download
	WebDriver driver=new ChromeDriver();//creating driver object
		
		/*
		 * driver.get("https://www.google.com/");//hitting the url driver.getTitle();
		 * //fetching the title of the page System.out.println(driver.getTitle());
		 * //printing the fetched title System.out.println(driver.getCurrentUrl());
		 * //fetching the url //System.out.println(driver.getPageSource()); //fetching
		 * the page source driver.get("https://yahoo.com");//go to yahoo
		 * driver.navigate().back(); // navigate back to google
		 * driver.navigate().forward(); //navigate forward to yahoo driver.close(); //
		 * for closing the current browser driver.quit(); // closes all the browsers
		 * opened by selenium
		 */
	
	driver.get("https://www.facebook.com/");
		/*
		 * driver.findElement(By.id("email")).sendKeys("test");
		 * driver.findElement(By.name("pass")).sendKeys("pass");;
		 * driver.findElement(By.linkText("Forgotten account?")).click();;
		 * 
		 * driver.close();
		 */
	//driver.findElement(By.className("")).sendKeys("test");
	driver.findElement(By.cssSelector("#email")).sendKeys("test");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("test");
	driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a\r\n")).click();
	
		
		
	}

}
