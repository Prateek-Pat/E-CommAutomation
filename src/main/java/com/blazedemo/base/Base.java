package com.blazedemo.base;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.blazedemo.utils.Utility;

public class Base {
 
	public static Properties prop;
	public static WebDriver driver;


	public Base() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\blazedemo\\config\\config.properties");
		prop.load(fis);
	}

	public static void Initlialize() {

		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("Chrome")) {

			/*System.setProperty(
					"webdriver.chrome.driver", "E:\\STUDY Mate\\SELENIUM\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();*/

			//WebDriverManager.chromedriver().driverVersion("90.0.4").setup();
			
			
			WebDriverManager.chromedriver().setup();
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
		}

		else if (BrowserName.equalsIgnoreCase("firefox")) {

			System.setProperty(
					"webdriver.gecko.driver",
					System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\blazedemo\\executaable\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Utility.pageloadTimout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utility.implicitTimeout, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));	
	}

	public static void getScreenshot(String Methodname) throws IOException{

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\prate\\workspace\\BalzeDemoAutomation\\Screenshot\\"+Methodname+"."+"jpg"));
	}


}
	