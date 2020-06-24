package travelSite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass
{
	public WebDriver driver;
	public Properties prop;
	
	//Example of parallel execution :
	//@Parameter(value={"browserName"})
	public WebDriver initialiseDrivers() throws IOException
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Biswajeet Nayak\\eclipse-workspace\\makeMyTrip\\makeMyTrip\\src\\main\\java\\travelSite\\data.properties");
		prop.load(file);
		
		String browserName = prop.getProperty("browserUsed");
		System.out.println("The browser going to be used is : "+browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
}
