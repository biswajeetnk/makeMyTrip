//search flights for logged in user

package testCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import objectRepository.searchPage;
import travelSite.baseClass;
//import utils.excelUtils;
import objectRepository.createAccount;
import objectRepository.makeMyTripPage;
import objectRepository.loginUser;
import objectRepository.searchFlights;

public class testCase5 extends baseClass
{

	@Test
	public void search() throws IOException, InterruptedException 
	{

		driver = initialiseDrivers();
		driver.get(prop.getProperty("url"));

		/*testCase1 tc1 = new testCase1();
		tc1.launchGooglePage();

		testCase2 tc2 = new testCase2();
		tc2.launchMMT();*/

		/*String excelPath = prop.getProperty("excelDataPath");
		excelUtils excel = new excelUtils(excelPath, "userDetails");
		excel.getRowCount();
		excel.getColCount();*/
		//excel.getUserName();
		//excel.getPassword();
		//excel.getFromCity();
		//driver.close();
		/*excel.getToCity();
		excel.getTravellingMonth();
		excel.getTravellingDate();
		excel.getReturnMonth();
		excel.getReturnDate();*/

		/*googlePage gp = new googlePage(driver);
		gp.enterData().sendKeys("make my trip");
		gp.enterData().sendKeys(Keys.ENTER);

		searchPage sp = new searchPage(driver);
		Thread.sleep(5000);
		sp.clickLink().click();*/

		createAccount ca = new createAccount(driver);
		loginUser login = new loginUser(driver);
		Thread.sleep(5000);
		ca.clickCreateBtn().click();
		login.userName().sendKeys(prop.getProperty("loginId"));
		login.clickContinueBtn().click();
		Thread.sleep(5000);
		//login.clickLoginViaPwd().click();
		login.userPassword().sendKeys(prop.getProperty("loginPwd"));
		login.clickLoginBtn().submit();
		Thread.sleep(15000);



		searchFlights sf = new searchFlights(driver);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sf.toCityTextBox().click();
		Thread.sleep(5000);
		sf.inputField().sendKeys(prop.getProperty("toCity"));
		Thread.sleep(8000);
		sf.toCityList().click();
		sf.frmCityTextBox().click();
		Thread.sleep(5000);
		sf.inputField().sendKeys(prop.getProperty("fromCity"));
		Thread.sleep(5000);
		sf.frmCityList().click();

		//logic for clicking departure date-picker
		String month4 = prop.getProperty("departureMonth");
		//String month5 = month4.replaceAll("\\s", "");
		sf.departDate().click();
		while(!sf.selectMonth().getText().contains(month4))//go on clicking the right arrow button until month is found
		{
			sf.clickRightArrow().click();
		}

		int count = sf.selectDate().size();
		for(int i = 0; i<count; i++)
		{
			String date = sf.selectDate().get(i).getText();
			if(date.contains(prop.getProperty("departureDate")))
			{
				sf.selectDate().get(i).click();
				break;
			}
		}


		//logic for clicking return date-picker
		String month1 = prop.getProperty("returnMonth");
		String month2 = month1.replaceAll("\\s", "");
		sf.returnDate().click();
		boolean month3 = sf.selectMonth().getText().contains(month2);

		System.out.println("Month is : "+month3);
		while(!sf.selectMonth().getText().contains(month2))//go on clicking the right arrow button until month is found
		{
			sf.clickRightArrow().click(); 
		}

		int count2 = sf.selectDate().size();
		for(int i = 0; i<count2; i++)
		{
			String date2 = sf.selectDate().get(i).getText();
			if(date2.contains(prop.getProperty("returnDate")))
			{
				sf.selectDate().get(i).click();
				break;
			}
		}


		Thread.sleep(5000);
		sf.clickSrchBtn().click();
		System.out.println("TC 5 executed successfully");
		//addede tc5

	}

}