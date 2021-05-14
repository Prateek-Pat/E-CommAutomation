package com.blazedemo.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.blazedemo.base.Base;
import com.blazedemo.pages.HomePage;
import com.blazedemo.pages.ProductDetailsPage;

public class ProductDetailsPageTest extends Base{
	
	public HomePage hp;
	public ProductDetailsPage productpage;
	
	public ProductDetailsPageTest() throws IOException {
		super();	
	}	
	
	@BeforeMethod
	public void setUp() throws IOException{
		
		Base.Initlialize();
		hp = new HomePage();
		productpage = new ProductDetailsPage();
	}
	
	@AfterMethod
	public void tearDown(){	
		driver.quit();
	}
	
	@Test(priority = 1)
	public void validateLoginFunctionalityTest() throws IOException{
		hp.clickOnLoginLink();
		hp  = hp.LoginFunctionality(prop.getProperty("userName"), prop.getProperty("password"));	
	}
	
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
}
	
	
	

