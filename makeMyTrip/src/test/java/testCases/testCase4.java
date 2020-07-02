//Login to MMT account
package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import objectRepository.createAccount;
import objectRepository.makeMyTripPage;
import objectRepository.loginUser;
import objectRepository.searchPage;
import travelSite.baseClass;

public class testCase4 extends baseClass
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		
		driver = initialiseDrivers();
		//WebDriverWait  wait = new WebDriverWait(driver, 15);
		
		driver.get(prop.getProperty("url"));
		
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
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(login.clickLoginBtn())); //explicit wait
		System.out.println("Test case 4 executed successfully");
	}
}
