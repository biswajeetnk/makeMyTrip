//Verify the various actions in makeMyTrip website - like right click, scroll-up, scroll-down, hover - using Actions class

package testCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import objectRepository.makeMyTripPage;
import objectRepository.searchPage; // importing search page repository
import travelSite.baseClass;

public class testCase2 extends baseClass
{
	makeMyTripPage mmtp;

	@BeforeTest
	public void launchMMT() throws IOException, InterruptedException
	{
		driver = initialiseDrivers();
		driver.get(prop.getProperty("url"));
		/*JavascriptExecutor js = (JavascriptExecutor) driver; //to scroll-down to end-of-the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/

		Actions action = new Actions(driver);
		action.click().build().perform();
	}

	@Test(priority=1)
	public void navigateToFlight() 
	{
		mmtp = new makeMyTripPage(driver);
		mmtp.clickFlights().click();
		String flightUrl = driver.getCurrentUrl();
		System.out.println("Flight url : "+flightUrl);
		throw new SkipException("This test has been skipped");
	}

	@Test(priority=4)
	public void navigateToHotels()
	{
		mmtp = new makeMyTripPage(driver);
		mmtp.clickHotels().click();
		String hotelUrl = driver.getCurrentUrl();
		System.out.println("Hotel url : "+hotelUrl);
	}

	@Test(priority=3)
	public void navigateToBus()
	{
		mmtp = new makeMyTripPage(driver);
		mmtp.clickBuses().click();
		String busUrl = driver.getCurrentUrl();
		System.out.println("Bus url : "+busUrl);
	}

	@Test(priority=2)
	public void navigateToCabs()
	{
		mmtp = new makeMyTripPage(driver);
		mmtp.clickCabs().click();
		String cabsUrl = driver.getCurrentUrl();
		System.out.println("Cabs url : "+cabsUrl);
	}

	@Test(priority=-1)
	public void navigateToHolidays()
	{
		mmtp = new makeMyTripPage(driver);
		mmtp.clickHolidays().click();
		String holidaysUrl = driver.getCurrentUrl();
		System.out.println("Holidays url : "+holidaysUrl);
	}

	@Test(priority=0)
	public void navigateToTrains()
	{
		mmtp = new makeMyTripPage(driver);
		mmtp.clickTrains().click();
		String trainUrl = driver.getCurrentUrl();
		System.out.println("Train url : "+trainUrl);
	}

	@Test(priority=1)
	public void navigateToVillas()
	{
		mmtp = new makeMyTripPage(driver);
		mmtp.clickVillas().click();
		String villasUrl = driver.getCurrentUrl();
		System.out.println("Villas url : "+villasUrl);
	}

	@Test
	public void navigateVisas()
	{
		mmtp = new makeMyTripPage(driver);
		mmtp.clickVisas().click();
		String visaUrl = driver.getCurrentUrl();
		System.out.println("Visa url : "+visaUrl);
	}

	@AfterTest(enabled=false)
	public void finishTest()
	{
		System.out.println("Test Case 2 executed successfully");
		//driver.close();
	}

}
