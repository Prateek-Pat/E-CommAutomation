package com.blazedemo.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.blazedemo.base.Base;
import com.blazedemo.pages.HomePage;

public class HomePageTest extends Base {	
	
/*
	// 1) Constructor
	// 2) @BeforeMethod
	// 3) @AfterMethod
	// 4) @Test
*/	
	public HomePage hp;
	public HomePage homepage;
	
	
	public HomePageTest() throws IOException {
		super();
	}

	
	@BeforeMethod
	public void setUp() throws IOException{
		
		Base.Initlialize();
		hp = new HomePage();
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	@Test(priority=2)
	public void validateLoginFunctionalityTest() throws IOException{
		hp.clickOnLoginLink();		
		homepage = hp.LoginFunctionality(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	/*@Test(priority =1)
	public void validateclickOnLoginLinkTest(){
		hp.clickOnLoginLink();		
	}*/
	
	@Test(priority=1)
	public void validateSingUpFunctioanlityTest() throws IOException{
		hp.clickOnSingUpLink();
		homepage = hp.SingUpFunctionality(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void validateScrollingFunctionalityTest(){
		hp.scrollingArrow();
		hp.scrollingArrow();			
	}
}



