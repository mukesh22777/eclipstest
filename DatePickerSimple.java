package multifunction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerSimple {
	 @Test

	    public void testDAtePicker() throws Exception{
	
	//DAte and Time to be set in textbox

    //String dateTime ="12/07/2014 2:00 PM";
    //Providing path to chromedriver.exe and initiating the browser launch
	//System.setProperty("webdriver.chrome.driver","C://Users//sricharan.talasila//Downloads//chromedriver_win32//chromedriver.exe");
   // ChromeDriver driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver","H:\\New folder\\driver\\chrome\\chromedriver.exe");
		    ChromeDriver driver = new ChromeDriver();
   // driver.manage().window().maximize();
      
    //Launching the site.				
    driver.get("http://demo.guru99.com/selenium");

    //Find the date time picker control

    WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

    //Fill date as mm/dd/yyyy as 09/25/2013

    dateBox.sendKeys("08011988");

    //Press tab to shift focus to time field

    dateBox.sendKeys(Keys.TAB);

    //Fill time as 02:45 PM

    dateBox.sendKeys("0445PM");
    //driver.close();

}
}