package com.blazedemo.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.blazedemo.base.Base;
import com.blazedemo.pages.HomePage;
import com.blazedemo.pages.ProductDetailsPage;


@Listeners(com.blazedemo.listerners.CustomListener.class)
public class ProductDetailsPageTest extends Base{
	
	public HomePage hp;
	public HomePage homepage;
	public ProductDetailsPage productpage;
	
	public ProductDetailsPageTest() throws IOException {
		super();	
	}	
	
	@BeforeMethod
	public void setUp() throws IOException{
		
		Base.Initlialize();
		hp = new HomePage();
		productpage = new ProductDetailsPage();
		//hp.clickOnLoginLink();		
	}
	
	@AfterMethod
	public void tearDown(){	
		driver.quit();
	}
	
	@Test(priority = 1)
	public void validateLoginFunctionalityTest() throws IOException{
		hp.clickOnLoginLink();
		homepage   = hp.LoginFunctionality(prop.getProperty("userName"), prop.getProperty("password"));	
	}
	
	// NokiavalidationTest
	@Test(priority= 2)
	public void validateNokiaLumiaText() throws IOException{
		productpage  = hp.clickOnNokia();
		boolean flag = productpage.NokiaLumiatext();
		Assert.assertTrue(flag);		
	}
	
	@Test(priority= 3)
	public void validateNokiaPriceTest() throws IOException{
		productpage = hp.clickOnNokia();
		boolean flag2 = productpage.NokiaPrice();
		Assert.assertTrue(flag2);
	}
	
	@Test(priority= 4)
	public void validateAddToCartTest() throws IOException{
		productpage = hp.clickOnNokia();
		productpage.AddToCart();
		
	}
	
		
	// MacBookairTest
	@Test(priority=5)
	public void validateMacBookairText() throws IOException{
		hp.clickOnLaptops();
		boolean flag = productpage.MacBookairtext();
		Assert.assertTrue(flag);
		
		
	}
		
	@Test(priority=6)
	public void validateMacBookairPriceTest() throws IOException{
		hp.clickOnLaptops();
		boolean flag = productpage.MacBookairPrice();
		Assert.assertTrue(flag);		
	}
	
	@Test(priority=7)
	public void validaateMacbookairAddToCartTest() throws IOException{
		hp.clickOnLaptops();
		productpage.macAddToCart();
	    		
	}
	
	// AsusMonitor
	
	@Test(priority=8)
	public void validaateAsusTextTest() throws IOException{
		hp.clickOnMonitors();
		boolean flag = productpage.Asustext(); 
		Assert.assertTrue(flag);
	}		
	
	@Test(priority=9)
	public void validateAsusPriceTest() throws IOException{
		hp.clickOnMonitors();
		boolean flag = productpage.AsusPrice();		
	}
	
	@Test(priority=10)
	public void vallidateAsusCartTest() throws IOException{
		hp.clickOnMonitors();
		productpage.asusAddToCart();	
	}
}

	
	
	

