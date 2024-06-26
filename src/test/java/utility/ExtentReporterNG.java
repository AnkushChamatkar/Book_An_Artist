package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
	
	static ExtentReports extent;
	
	public static ExtentReports getReporterObject() {
		
        String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Book An Artist Automation");
		reporter.config().setDocumentTitle("result");
		reporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ankush Chamatkar");
		
		return extent;
		
	}

}
