//create account

package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createAccount
{
	WebDriver wd;
	
	By clickCreateAcocunt = By.cssSelector("li[class*='lhUser']");
	By clickCreateNewAcct = By.cssSelector("a.latoBlack");
	By enterMobileNumber = By.id("emailOrPhone");
	By enterPassword = By.id("password");
	By checkBox = By.id("tnc");
	By clickCreateBtn = By.cssSelector("button[class*='capText']"); //use css selector * OR ^ OR $
	By usrAlreadyExistsText = By.xpath("//*[@id='SW']/div[2]/div[2]/div[2]/section/form/div[1]/p/span[2]");
	
	
	
	public createAccount(WebDriver driver)
	{
		wd = driver;
	}

	public WebElement clickCreateBtn()
	{
		return wd.findElement(clickCreateAcocunt);
	}
	
	public WebElement createNewAcct()
	{
		return wd.findElement(clickCreateNewAcct);
	}
	
	public WebElement enterMobileNo()
	{
		return wd.findElement(enterMobileNumber);
	}
	
	public WebElement enterPwd()
	{
		return  wd.findElement(enterPassword);
	}
	
	public WebElement selectCheckBox()
	{
		return wd.findElement(checkBox);
	}
	
	public WebElement createAcctBtnSubmit()
	{
		return wd.findElement(clickCreateBtn);
	}
	
	public WebElement userExixtsText()
	{
		return wd.findElement(usrAlreadyExistsText);
	}
}
