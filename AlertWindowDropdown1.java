package multifunction;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertWindowDropdown1 {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","H:\\New folder\\driver\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
    //Opening an url
      driver.manage().window().maximize();
      driver.get("https://www.orangehrm.com/try-it-for-free.php");
    
      boolean trialpagedisplayed = driver.findElementByClassName("marginBottom25").isDisplayed();
       if(trialpagedisplayed==true){
    	   driver.findElementByXPath("//*[@id='orangeUrl']").sendKeys("Orange123");
    	   
    	   boolean CAdisplayed = driver.findElementByXPath(".//*[@id='checkAvailability']").isDisplayed();
    	   boolean CAenabled = driver.findElementByXPath(".//*[@id='checkAvailability']").isEnabled();
    	   
    	   if(CAdisplayed==true && CAenabled==true){
    		   System.out.println("Check availability button is available");
    	   driver.findElementByXPath(".//*[@id='checkAvailability']").click();
    	   }
    	   else{
    		   System.out.println("Check availability not available to click");
    	   }
       }
        
    
       boolean DummydataPresence = driver.findElementByXPath(".//*[@id='dummyData']").isDisplayed();
    boolean DummydataEnabled = driver.findElementByXPath(".//*[@id='dummyData']").isEnabled();
    boolean DummydataSelected = driver.findElementByXPath(".//*[@id='dummyData']").isSelected();
     
    if(DummydataPresence==true && DummydataEnabled==true && DummydataSelected==false) {
    	 driver.findElementByXPath(".//*[@id='dummyData']").click();
      }
     
  
      WebElement mySelectElement = driver.findElement(By.name("country"));
      Select dropdown= new Select(mySelectElement);
      dropdown.selectByVisibleText("Italy");
    
    //Selecting Items in a Multiple SELECT elements
    //driver.get("http://jsbin.com/osebed/2");
    //Select fruits = new Select(driver.findElement(By.id("fruits")));
    //fruits.selectByVisibleText("Banana");
    //fruits.selectByIndex(1);
    //fruits.selectByVisibleText("Orange");
    //fruits.selectByIndex(3);
    //fruits.deselectByVisibleText("Banana");
    //fruits.deselectAll();
      
      driver.switchTo().alert().accept();
      driver.switchTo().alert().dismiss();
      
      driver.switchTo().alert().getText();
      
      
      driver.getWindowHandle();
      driver.getWindowHandles();
      
      
      

	}

}
