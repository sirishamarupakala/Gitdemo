import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//creating object for DesiredCapabilities of Chrome (general chrome profile)
		DesiredCapabilities ch =DesiredCapabilities.chrome();
		ch.acceptInsecureCerts(); // giving it the features to accept the insecure certicate
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); //other way to accept insecure and ssl certificates
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c= new ChromeOptions(); //creating object for ChromeOptions for your local browser
		c.merge(ch); //merging the profile to your local browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);//creating driver object and injecting the merged features
		
	}

}
