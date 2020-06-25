package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginUser
{
	WebDriver wd;
	
	By userId = By.id("username");
	By pwd = By.id("password");
	//By checkBox = By.id("remember");
	By continueBtn = By.xpath("//button[@class='capText font16']//child::span[text()='Continue']");
	By loginViaPwd = By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div[2]/section/form/div[3]/a");
	By loginBtn = By.xpath("//button[@data-cy='login']//child::span[text()='Login']");
			
	public loginUser(WebDriver driver)
	{
		this.wd = driver;
	}
	
	public WebElement userName()
	{
		return wd.findElement(userId);
	}
	
	public WebElement userPassword()
	{
		return wd.findElement(pwd);
	}
	
	public WebElement clickContinueBtn()
	{
		return wd.findElement(continueBtn);
	}

	public WebElement clickLoginViaPwd()
	{
		return wd.findElement(loginViaPwd);
	}
	
	public WebElement clickLoginBtn()
	{
		return wd.findElement(loginBtn);
	}
	
}
