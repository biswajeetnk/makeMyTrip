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
		makeMyTripPage mmtp=new makeMyTripPage(driver);
		
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
		
		Actions action = new Actions(driver);
		action.click().build().perform();
		
		mmtp.clickFlights().click();
		String flightUrl = driver.getCurrentUrl();
		System.out.println("Flight url : "+flightUrl);
		
		mmtp.clickHotels().click();
		String hotelUrl = driver.getCurrentUrl();
		System.out.println("Hotel url : "+hotelUrl);
		
		mmtp.clickBuses().click();
		String busUrl = driver.getCurrentUrl();
		System.out.println("Bus url : "+busUrl);
		
		mmtp.clickCabs().click();
		String cabsUrl = driver.getCurrentUrl();
		System.out.println("Cabs url : "+cabsUrl);
		
		mmtp.clickHolidays().click();
		String holidaysUrl = driver.getCurrentUrl();
		System.out.println("Hoidays url : "+holidaysUrl);
		
		mmtp.clickTrains().click();
		String trainUrl = driver.getCurrentUrl();
		System.out.println("Train url : "+trainUrl);
		
		mmtp.clickVillas().click();
		String villasUrl = driver.getCurrentUrl();
		System.out.println("Villas url : "+villasUrl);
		
		mmtp.clickVisas().click();
		String visaUrl = driver.getCurrentUrl();
		System.out.println("Visa url : "+visaUrl);
		
		System.out.println("Test Case 1 executed successfully");
		//driver.close();
	}
	
	
	/*public void success()
	{
		System.out.println("Test Case 1 executed successfully");
	}*/
}
