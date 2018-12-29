package multifunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","H:\\New folder\\driver\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("http://www.google.com");
	    WebElement ele = driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a"));
	    Actions action = new Actions(driver);
	    action.moveToElement(ele).build().perform();
	}

}
