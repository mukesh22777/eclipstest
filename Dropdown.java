package multifunction;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\New folder\\driver\\chrome\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    //Selecting a single value in a dropdown
	    /*driver.get("http://demo.guru99.com/test/newtours/register.php");
	    Thread.sleep(5000);
		WebElement mySelectElement = driver.findElement(By.name("country"));
	    Select dropdown= new Select(mySelectElement);
	    dropdown.selectByVisibleText("ANTARCTICA");
	    dropdown.selectByValue("ANTARCTICA");
	    dropdown.selectByIndex(6);
	    //System.out.println("Selected country is displayed");
	    //driver.close();*/

		//Selecting Items in a Multiple SELECT elements
	    
	    
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(2000);
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		Thread.sleep(1000);
		if (fruits.isMultiple())
		{
		fruits.selectByVisibleText("Banana");
		Thread.sleep(1000);
		fruits.selectByIndex(1);
		Thread.sleep(1000);
		System.out.println("Banana and Index 1 values are selected");
		Thread.sleep(3000);
		fruits.deselectAll();
		}
		else 
		{
			System.out.println("This is not a multiple select drop down");
		}
		
	}

}

