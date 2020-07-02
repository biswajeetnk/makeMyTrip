//Verify the various actions in makeMyTrip website - like right click, scroll-up, scroll-down, hover - using Actions class

package testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import objectRepository.makeMyTripPage;
import objectRepository.searchPage; // importing search page repository
import travelSite.baseClass;

public class testCase2 extends baseClass
{
	@Test
	public void launchMMT() throws IOException, InterruptedException
	{
		driver = initialiseDrivers();
		driver.get(prop.getProperty("url"));
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver; //to scroll-down to end-of-the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		
		
		Actions action = new Actions(driver);//instantiate Actions class
		String pageUrl = driver.getCurrentUrl();
		System.out.println("The page URL is : "+pageUrl);
		
		System.out.println("Test Case 2 excuted successfully - able to click MakeMyTrip URL");
		//.driver.close();
	}
}
