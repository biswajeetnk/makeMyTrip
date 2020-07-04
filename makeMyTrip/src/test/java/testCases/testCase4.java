//Login to MMT account
package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import objectRepository.createAccount;
import objectRepository.makeMyTripPage;
import objectRepository.loginUser;
import objectRepository.searchPage;
import travelSite.baseClass;

public class testCase4 extends baseClass
{

	@BeforeTest
	public void launchMMTPage() throws IOException, InterruptedException
	{
		driver = initialiseDrivers(); //calling initializeDrivers() method from baseClass.java
		Thread.sleep(3000);
		driver.get(prop.getProperty("url"));
	}


	@Test
	public void login() throws IOException, InterruptedException
	{
		createAccount ca = new createAccount(driver);
		loginUser login = new loginUser(driver);
		//Take screenshot
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("G:\\TestFailure.jpg"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait
		Thread.sleep(5000);
		ca.clickCreateBtn().click();
		login.userName().sendKeys(prop.getProperty("loginId"));
		login.clickContinueBtn().click();
		Thread.sleep(5000);
		//login.clickLoginViaPwd().click();
		login.userPassword().sendKeys(prop.getProperty("loginPwd"));
		login.clickLoginBtn().submit();
	}

	@AfterTest
	public void finishTest()
	{
		System.out.println("Test Case 1 executed successfully");
		//driver.close();
	}
}
