//object repository of Google search page - launch Google search page and enter MMT

package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class makeMyTripPage
{
	WebDriver driver;
	makeMyTripPage mmtp;
	
	By hotels = By.xpath("//li[@data-cy='menu_Hotels']");
	By villas = By.cssSelector("ul.makeFlex.font12>li:nth-of-type(3)");
	By holidays = By.className("menu_Holidays");
	By trains = By.xpath("//li[@data-cy='menu_Trains']"
			+ "//child::a[@class='makeFlex hrtlCenter column']"
			+ "//child::span[@class='chNavIcon appendBottom2 chSprite chTrains']"
			+ "//following-sibling::span[contains(text(),Trains)]");
	By buses = By.cssSelector("ul.makeFlex.font12>li:nth-of-type(6)");
	By cabs = By.cssSelector("ul.makeFlex.font12>li:nth-of-type(7)");
	By visa = By.cssSelector("ul.makeFlex.font12>li:nth-of-type(8)");
	By flights = By.cssSelector("ul.makeFlex.font12>li:first-of-type");
	
	public makeMyTripPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickHotels()
	{
		return driver.findElement(hotels);
	}
	
	public WebElement clickVillas()
	{
		return driver.findElement(villas);
	}
	
	public WebElement clickHolidays()
	{
		return driver.findElement(holidays);
	}
	
	public WebElement clickTrains()
	{
		return driver.findElement(trains);
	}
	
	public WebElement clickBuses()
	{
		return driver.findElement(buses);
	}
	
	public WebElement clickCabs()
	{
		return driver.findElement(cabs);
	}
	
	public WebElement clickFlights()
	{
		return driver.findElement(flights);
	}
	
	public WebElement clickVisas()
	{
		return driver.findElement(visa);
	}
}