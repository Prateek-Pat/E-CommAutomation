package com.blazedemo.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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

			System.setProperty(
					"webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "\\src\\main\\java\\com\\blazedemo\\executaable\\chromedriver_win32.zip");
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

}
