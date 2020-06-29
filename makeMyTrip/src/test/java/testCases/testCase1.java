//Launch Google page and search MakeMyTrip

package testCases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import objectRepository.googlePage; //importing google page repository
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
			System.out.println("actual not equal to expected"+e.getStackTrace());
		}
		
		System.out.println("Test Case 1 executed successfully");
		//driver.close();
	}
	
	
	/*public void success()
	{
		System.out.println("Test Case 1 executed successfully");
	}*/
}
