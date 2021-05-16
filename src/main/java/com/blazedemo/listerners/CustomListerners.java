package com.blazedemo.listerners;

import java.io.IOException;

import org.testng.ITestListener;


import org.testng.ITestResult;

import com.blazedemo.base.Base;

public class CustomListerners extends Base implements ITestListener{
	
public CustomListerners() throws IOException {
		
	}

	public void onTestFailure(ITestResult result) {
		try {
			getScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
