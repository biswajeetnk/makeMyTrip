//create account

package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createAccount
{
	WebDriver wd;
	
	By clickCreateAcocunt = By.xpath("//label[text()='Login with Phone/Email']");
	By clickCreateNewAcct = By.xpath("//button[@class='capText font16']//child::span[text()='Continue']");
	By enterMobileNumber = By.id("emailOrPhone");
	By enterPassword = By.cssSelector("input#password");
	By checkBox = By.cssSelector("input#tnc");
	By clickCreateBtn = By.xpath("//button[@class='capText font16']//child::span[text()='Create Account']");
	By clickCreateBtn2 = By.xpath("//button[@class='capText font16']");
	By skipIt = By.xpath("//p[text()=' Skip ']");
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
		return wd.findElement(clickCreateBtn2);
	}
	
	public WebElement userExixtsText()
	{
		return wd.findElement(usrAlreadyExistsText);
	}
	
	public WebElement skipIt()
	{
		return wd.findElement(skipIt);
	}
}
