//Object repository for Google search page - click on MMT link

package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class searchPage
{
	WebDriver wd;
	
	By clickLink = By.partialLinkText("MakeMyTrip");
	//By clickLink = By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div[1]/a/h3");
	
	public searchPage(WebDriver driver)
	{
		this.wd=driver;
	}
	
	public WebElement clickLink()
	{
		return wd.findElement(clickLink);
		
	}
}
