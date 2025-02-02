package UtilityDrive;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
	public static ExtentReports getExtentReport() {

		String extentReportPath = System.getProperty("user.dir") + "\\Report\\ExtendReport.html"; 
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("Grid Browser Results");
		reporter.config().setDocumentTitle("Grid Browser Test Results");

		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);

		return extentReport;
	}
}
