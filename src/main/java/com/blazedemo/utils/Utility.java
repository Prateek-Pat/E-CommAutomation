package com.blazedemo.utils;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.blazedemo.base.Base;
import com.blazedemo.pages.CartPage;


public class Utility extends Base {	
	
	public static WebDriverWait wait;
	public static Alert alert;
	

	public Utility() throws IOException {
		
	}

	public static int pageloadTimout = 20;
	public static int implicitTimeout = 20;
	
	//public static void driver;
	
/*	public static void getScreenshot(String Methodname) throws IOException{
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\prate\\workspace\\BalzeDemoAutomation\\Screenshot"+Methodname+"."+"jpg"));
	}
		*/
	
	public static void explicityWait(){
		
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		alert.accept();
		
		//return true;
		
	}
	
	public static void explicitlyWait(){
		wait = new WebDriverWait(driver, 10);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Cart')]")));
		
		//return new CartPage();
		
	}
	
}	
