//Create new account
package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.googlePage;
import objectRepository.loginUser;
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
		
		createAccount ca = new createAccount(driver);
		loginUser login = new loginUser(driver);
		Thread.sleep(5000);
		ca.clickCreateBtn().click();
		//String placeholderValue = ca.enterMobileNo().getAttribute("placeholder");
		//String placeholderValue2 = ca.enterPwd().getAttribute("placeholder");
		//System.out.println("Placeholder Value is : "+placeholderValue);
		//System.out.println("Placeholder value is : "+placeholderValue2);
		login.userName().sendKeys(prop.getProperty("loginId2"));
		login.clickContinueBtn().click();
		boolean createButtonEnabled = ca.createAcctBtnSubmit().isEnabled();
		System.out.println("is Create Account button enabled : "+createButtonEnabled);
		Thread.sleep(5000);
		ca.enterPwd().sendKeys(prop.getProperty("loginPwd2"));
		String enteredPassword = ca.enterPwd().getAttribute("value");
		System.out.println("The entered password is : "+enteredPassword);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tnc']")));
		//ca.selectCheckBox().click();
		//System.out.println(ca.selectCheckBox().isSelected());
		
		if(ca.selectCheckBox().isSelected())
		{
			ca.createAcctBtnSubmit().click();
			//System.out.println("Create account");
		}
		else
		{
			//System.out.println("Checkbox is not selected");
			ca.selectCheckBox().click();
		}
		
		ca.skipIt().click();
		//Assert.assertEquals(ca.userExixtsText().getText(), prop.getProperty("userExistsTextExpected"));
		System.out.println("Test Case 3 executed successfully");
		//driver.close();
	}
}
