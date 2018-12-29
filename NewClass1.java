package multifunction;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass1 {

	public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
	//Providing path to chromedriver.exe and initiating the browser launch
	//  System.setProperty("webdriver.chrome.driver","C://Users//sricharan.talasila//Downloads//chromedriver_win32//chromedriver.exe");
    //  ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","H:\\New folder\\driver\\chrome\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
        
    //Launching the site.				
      driver.get("https://www.facebook.com/");			
     // driver.manage().window().maximize();		
      Thread.sleep(5000);   		
      driver.findElement(By.xpath("//*[@id='terms-link']")).click();
  		
      String MainWindow=driver.getWindowHandle();		
  		
  // To handle all new opened windows.			
      Set<String> s1=driver.getWindowHandles();		
      Iterator<String> i1=s1.iterator();		
  		
  while(i1.hasNext())			
  {		
      String ChildWindow=i1.next();		
      		
      if(!MainWindow.equalsIgnoreCase(ChildWindow))			
      {   
    	  
    	  System.out.println("Child Window is displayed and available");
              // Switching to Child window
              driver.switchTo().window(ChildWindow);		
                                                                                   
               Thread.sleep(3000);                                                         
            //    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                                     
              // driver.findElementByCssSelector("b..firepath-matching-node").isDisplayed();
               Thread.sleep(5000);            
		// Closing the Child Window.
                  driver.close();
                  System.out.println("Child Window is closed");
      }	

    	  
     }		
  // Switching to Parent window i.e Main Window.
      driver.switchTo().window(MainWindow);
      driver.close();

	}

}
