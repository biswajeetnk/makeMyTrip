//Create new account
package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.googlePage;
import objectRepository.searchPage;
import travelSite.baseClass;
import objectRepository.createAccount;

public class testCase3 extends baseClass
{
@Test	
	public void accountRegistration() throws IOException, InterruptedException
	{
		driver = initialiseDrivers();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//WebElement ele = null;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		googlePage gp = new googlePage(driver);
		gp.enterData().sendKeys("make my trip");
		gp.enterData().sendKeys(Keys.ENTER);
		searchPage sp = new searchPage(driver);
		Thread.sleep(5000);
		sp.clickLink().click();
		
		createAccount ca = new createAccount(driver);
		//Select s = new Select(ele);
		Thread.sleep(10000);
		ca.clickCreateBtn().click();
		ca.createNewAcct().click();
		String placeholderValue = ca.enterMobileNo().getAttribute("placeholder");
		String placeholderValue2 = ca.enterPwd().getAttribute("placeholder");
		System.out.println("Placeholder Value is : "+placeholderValue);
		System.out.println("Placeholder value is : "+placeholderValue2);
		ca.enterMobileNo().sendKeys(prop.getProperty("mobileNumber"));
		ca.enterPwd().sendKeys(prop.getProperty("pwd"));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tnc']")));
		//ca.selectCheckBox().click();
		//System.out.println(ca.selectCheckBox().isSelected());
		
		if(ca.selectCheckBox().isSelected())
		{
			ca.createAcctBtnSubmit().click();
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
		
		//System.out.println(ca.userExixtsText().getText());
		Assert.assertEquals(ca.userExixtsText().getText(), prop.getProperty("userExistsTextExpected"));
		System.out.println("Test Case 3 executed successfully");
		driver.close();
	}
}
