package travelSite;

import org.testng.IReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
public class ExtentReporterNG implements IReporter
{
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("MakeMyTrip Test Execution");
		reporter.config().setDocumentTitle("MMT Test Execution Report");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter); //Attach a ExtentReporter reporter, allowing it to access all started tests, nodes and logs
		extent.setSystemInfo("Tested", "Biswajeet Nayak");

		
		return extent;
	}
}
