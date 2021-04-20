package extent.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		//ExtentReports, ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("First Extent Report");
		reporter.config().setDocumentTitle("Extent1");
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sirisha");
	}
		
	@Test
	public void InitialDemo()
	{
		// TODO Auto-generated method stub
		ExtentTest test = extent.createTest("Initial Demo");
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\\\Users\\\\Ravi\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe")
		  ; WebDriver driver=new ChromeDriver();//creating driver object
		  driver.get("https://rahulshettyacademy.com");
		  System.out.println(driver.getTitle());
		  //test.addScreenCaptureFromBase64String(s);
		 // test.fail("Reports do not match");
		extent.flush();
		
	}
}
