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
	By continueBtn = By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div[2]/section/form/div[2]/button");
	By loginViaPwd = By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div[2]/section/form/div[3]/a");
	By loginBtn = By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div[2]/section/form/div[2]/button/span");
			
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
	
	//click login button
	public WebElement clickLoginBtn()
	{
		return wd.findElement(loginBtn);
	}
	
}
