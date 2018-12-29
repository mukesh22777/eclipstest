package multifunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {
	public static WebDriver driver;
	 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "H:\\New folder\\driver\\chromedriver.exe");
		String URL = "http://www.DemoQA.com";
 		@SuppressWarnings("unused")
		//String Node = "http://10.0.0.69:4444/wd/hub";
 		String Node = "http://192.168.0.21:4444/wd/hub";
 		DesiredCapabilities cap = DesiredCapabilities.chrome();
 
 		driver = new RemoteWebDriver(cap);
 
 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();

	}

}
