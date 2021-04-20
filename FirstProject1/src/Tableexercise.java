import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//creating driver object
		int sum=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29053/eng-vs-wi-1st-test-west-indies-tour-of-england-2020");
		WebElement table =driver.findElement(By.xpath("(//div[@class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"])[1]"));
	
		int row = table.findElements(By.xpath("((//div[@class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"])[1])//child::div[@class='cb-col cb-col-8 text-right text-bold']")).size();
		
		for(int i=1;i<row;i++)
			
		{
			
		String value=table.findElements(By.xpath("//div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
		int valueinteger = Integer.parseInt(value);
		sum=sum+valueinteger;
		
		}
		
		System.out.println(sum);
		String extras=driver.findElement(By.xpath("((//div[@class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"])[1])//child::div[@class=\"cb-col cb-col-8 text-bold cb-text-black text-right\"]")).getText();
		int extrasint =Integer.parseInt(extras);
		int total=sum+extrasint;
		String totaldisplayed=driver.findElement(By.xpath("((//div[@class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"])[1])//child::div[@class=\"cb-col cb-col-8 text-bold text-black text-right\"]")).getText();
		int totaldisplayedint =Integer.parseInt(totaldisplayed);
		if (total==totaldisplayedint)
		{
			System.out.println("pass");
			
		}
		}
		
}


