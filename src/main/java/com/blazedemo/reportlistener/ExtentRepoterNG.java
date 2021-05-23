package com.blazedemo.reportlistener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRepoterNG {
	
	
	public static ExtentReports report;
	
	public static ExtentReports getReport(){
		
		
		// Passing path where we waant to create report in ExtentSparkReporter parameter
		// Used for configuring the report
				
				String reportPath = System.getProperty("user.dir")+"\\reports\\index.html";
				ExtentSparkReporter extent = new ExtentSparkReporter(reportPath);
				extent.config().setReportName("WebAutomation_Report");
				extent.config().setDocumentTitle("Test_Report");
				
		// Now pass extent object in ExtentReports class so that it get to know that where the report 
		// is being generated
				
				report = new ExtentReports(); 
				report.attachReporter(extent);	
				report.setSystemInfo("Tester", "Max Payne");
				
				return report;
		
		
	}

}
