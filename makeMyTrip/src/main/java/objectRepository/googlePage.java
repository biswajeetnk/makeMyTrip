//object repository of Google search page - launch Google search page and enter MMT

package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlePage
{
	WebDriver driver;
	googlePage gp;
	
	By enterString = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
	
	//By clickOnSearchButton = By.xpath("/html/body/div/div[3]/form/div[2]/div/div[2]/div[2]/div[2]/center/input[1]");
	
	public googlePage(WebDriver wd)
	{
		this.driver=wd; 
	}
	
	public WebElement enterData()
	{
		return driver.findElement(enterString);
	}
	
	/*public WebElement clickBtn()
	{
		return driver.findElement(clickOnSearchButton);
	}*/
}