package com.blazedemo.listerners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.blazedemo.base.Base;
import com.blazedemo.reportlistener.ExtentRepoterNG;

	public class CustomListener extends Base implements ITestListener{
			
		public CustomListener() throws IOException {
			super();			
		}


		
		public ExtentReports report;
		
		
		public void onTestStart(ITestResult result) {
			
			report = ExtentRepoterNG.getReport();
			report.createTest(result.getMethod().getMethodName());
			
		}

		public void onTestSuccess(ITestResult result) {
			
			System.out.println("TestPassed");
			
		}

		public void onTestFailure(ITestResult result) {
			System.out.println("failed");
			
			try {
				getScreenshot(result.getMethod().getMethodName());
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			//ScreenShotUtility(result.getMethod().getMethodName());		
		}

		public void onStart(ITestContext context) {
			
		}

		public void onFinish(ITestContext context) {
			
			report.flush();
			
		}

		public void onTestSkipped(ITestResult result) {
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}		
}



