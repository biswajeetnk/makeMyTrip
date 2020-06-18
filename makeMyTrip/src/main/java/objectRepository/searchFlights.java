package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchFlights
{
	WebDriver driver;
	
	By srcTextBox = By.id("fromCity");
	By selectFrmCityList = By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]");
	By enterCity = By.cssSelector("input[class*='react-autosuggest__input']");
	By dstnTextBox = By.id("toCity");
	By selectToCityList = By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]");
	By departureDate = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]");
	By returnDate = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div/label");
	By searchBtn = By.cssSelector(".widgetSearchBtn");
	By months = By.className("DayPicker-Months");
	By month = By.className("DayPicker-Month");
	By monthCaption = By.className("DayPicker-Caption");
	By weekdays = By.className("DayPicker-Weekdays");
	By dateBody = By.className("DayPicker-Body");
	By selectDate = By.className("dateInnerCell");
	By rightArrow = By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]");

	public searchFlights(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//method for 'from' city search box
	public WebElement frmCityTextBox()
	{
		return driver.findElement(srcTextBox);
	}
	
	public WebElement frmCityList()
	{
		return driver.findElement(selectFrmCityList);
	}
	
	//method to click 'to' city search box
	public WebElement toCityTextBox()
	{
		return driver.findElement(dstnTextBox);
	}
	
	public WebElement toCityList()
	{
		return driver.findElement(selectToCityList);
	}
	
	public WebElement inputField()
	{
		return driver.findElement(enterCity);
	}
	
	//click SEARCH button
	public WebElement clickSrchBtn()
	{
		return driver.findElement(searchBtn);
	}
	
	//click departure date-picker
	public WebElement departDate()
	{
		return driver.findElement(departureDate);
	}
	
	//click return date-picker
	public WebElement returnDate()
	{
		return driver.findElement(returnDate);
	}
	
	public WebElement selectMonths()
	{
		return driver.findElement(months);
	}
	
	public WebElement selectMonth()
	{
		return driver.findElement(month);
	}
	
	public WebElement selectCaption()
	{
		return driver.findElement(monthCaption);
	}
	
	public WebElement selectWeekdays()
	{
		return driver.findElement(weekdays);
	}
	
	public List<WebElement> selectDateBody()
	{
		return driver.findElements(dateBody);
	}
	
	public List<WebElement> selectDate()
	{
		return driver.findElements(selectDate);
	}
	
	public WebElement clickRightArrow()
	{
		return driver.findElement(rightArrow);
	}

}
