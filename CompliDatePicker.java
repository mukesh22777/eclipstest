package multifunction;
import java.util.Calendar;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CompliDatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 //DAte and Time to be set in textbox

	    String dateTime ="01/08/2020 4:00 PM";
	    //Providing path to chromedriver.exe and initiating the browser launch
		//System.setProperty("webdriver.chrome.driver","C://Users//sricharan.talasila//Downloads//chromedriver_win32//chromedriver.exe");
	    //ChromeDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","H:\\New folder\\driver\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	     Thread.sleep(5000);
	    //Launching the site.				
	    driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");	
	    
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(5000);
	    
	    //button to open calendar

	    WebElement selectDate = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_dateview']"));
	    
	    selectDate.click();
	    Thread.sleep(5000);

	    //button to move next in calendar

	    WebElement nextLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-next')]"));

	    //button to click in center of calendar header

	    WebElement midLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));

	    //button to move previous month in calendar

	    WebElement previousLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')]")); 

	    //Split the date time to get only the date part
	    Thread.sleep(5000);

	    String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

	    //get the year difference between current year and year to set in calender
	    Thread.sleep(5000);

	    int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);
	    Thread.sleep(5000);
	    midLink.click();
	    Thread.sleep(5000);

	    if(yearDiff!=0){

	        //if you have to move next year

	        if(yearDiff>0){

	            for(int i=0;i< yearDiff;i++){
	            	Thread.sleep(5000);

	                System.out.println("Year Diff->"+i);

	                nextLink.click();

	            }

	        }

	        //if you have to move previous year

	        else if(yearDiff<0){

	            for(int i=0;i< (yearDiff*(-1));i++){
	            	Thread.sleep(5000);

	                System.out.println("Year Diff->"+i);

	                previousLink.click();

	            }

	        }

	    }
	    
	    Thread.sleep(3000);

	    //Get all months from calendar to select correct one

	    List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
	    
	    list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
	    
	    Thread.sleep(3000);

	    //get all dates from calendar to select correct one

	    List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
	    
	    list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
	    
	    ///FOR TIME
	    Thread.sleep(5000);

	    WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));

	    //click time picker button

	    selectTime.click();

	    //get list of times

	    List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
	  
	    dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];

	    //select correct time

	    for (WebElement webElement : allTime) {

	        if(webElement.getText().equalsIgnoreCase(dateTime))

	        {

	            webElement.click();

	        }

	    }
	}

}