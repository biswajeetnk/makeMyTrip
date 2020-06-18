//Click on MakeMyTrip.com and launch it

package testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import objectRepository.googlePage;
import objectRepository.searchPage; // importing search page repository
import travelSite.baseClass;

public class testCase2 extends baseClass
{
	@Test
	public void launchMMT() throws IOException, InterruptedException
	{
		driver = initialiseDrivers();
		driver.get(prop.getProperty("url"));
		
		testCase1 tc1 = new testCase1();
		tc1.launchGooglePage();
		/*googlePage gp = new googlePage(driver);
		Thread.sleep(10000);
		gp.enterData().sendKeys("make my trip");
		gp.enterData().sendKeys(Keys.ENTER);*/
		
		searchPage sp = new searchPage(driver);
		Thread.sleep(5000);
		sp.clickLink().click();
		System.out.println("Test Case 2 excuted successfully - able to click MakeMyTrip URL");
		driver.close();
	}
}
