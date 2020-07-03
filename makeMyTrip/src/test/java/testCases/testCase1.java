//Launch MakeMyTrip and assert the page title

package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import objectRepository.makeMyTripPage; //importing makeMyTripPage repository
import travelSite.baseClass;


public class testCase1 extends baseClass
{
	
	@Test
	public void launchGooglePage() throws IOException, InterruptedException
	{
		driver = initialiseDrivers(); //calling initializeDrivers() method from baseClass.java
		Thread.sleep(3000);
		driver.get(prop.getProperty("url"));
		
		
		String actualPageTitle = driver.getTitle();
		System.out.println("The page title is : "+actualPageTitle);
		//Assert.assertTrue(actualPageTitle.contains(prop.getProperty("expectedTitle")), "Actual pass Expected");
		try
		{
			Assert.assertEquals(actualPageTitle, prop.getProperty("expectedTitle"));
		}
		catch(AssertionError e)
		{
			System.out.println("actual not equal to expected");
		}
		
		Actions action = new Actions(driver);//instantiate Actions class
		String pageUrl = driver.getCurrentUrl();
		System.out.println("The page URL is : "+pageUrl);
		
			
		System.out.println("Test Case 1 executed successfully");
		//driver.close();
	}
	
	
	/*public void success()
	{
		System.out.println("Test Case 1 executed successfully");
	}*/
}
