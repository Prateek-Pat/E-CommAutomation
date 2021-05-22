package com.blazedemo.listerners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.blazedemo.base.Base;


	
	public class CustomListener extends Base implements ITestListener{

		public CustomListener() throws IOException {
			super();			
		}

		public void onTestStart(ITestResult result) {
			
		}

		public void onTestSuccess(ITestResult result) {
			
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
			
		}

		public void onTestSkipped(ITestResult result) {
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}		
}



