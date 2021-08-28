package com.blazedemo.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.blazedemo.base.Base;
import com.blazedemo.pages.CartPage;
import com.blazedemo.pages.HomePage;
import com.blazedemo.pages.ProductDetailsPage;
import com.blazedemo.utils.ExcelUtility;
import com.blazedemo.utils.Utility;

public class CartPageTest extends Base{
	
	public HomePage hp;
	public HomePage homepage;
	public CartPage cp;
	public ProductDetailsPage productpage;
	

	public CartPageTest() throws IOException {
		
	}

	@BeforeMethod
	public void setUpMethod() throws IOException{
		Base.Initlialize();
		hp = new HomePage();
		productpage = new ProductDetailsPage();
		cp = new CartPage();	
		//hp.LoginFunctionality(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	/*@Test(priority = 1)
	public void validateLoginFunctionalityTest() throws IOException{
		hp.clickOnLoginLink();
		homepage   = hp.LoginFunctionality(prop.getProperty("userName"), prop.getProperty("password"));	
	}
	*/
	// NokiavalidationTest
	/*@Test(priority= 1,enabled=true)
	public void validateNokiaLumiaText() throws IOException{
		productpage  = hp.clickOnNokia();
		boolean flag = productpage.NokiaLumiatext();
		Assert.assertTrue(flag);		
	}*/
	
	@Test(priority= 2)
	public void validateNokiaPriceTest() throws IOException{
		productpage = hp.clickOnNokia();
		boolean flag2 = productpage.NokiaPrice();
		Assert.assertTrue(flag2);
	}
	
	@Test(priority= 3)
	public void validateAddToCartTest() throws IOException{
		productpage = hp.clickOnNokia();
		productpage.AddToCart();
		
	}
	
		
	// MacBookairTest
	@Test(priority=4)
	public void validateMacBookairText() throws IOException{
		hp.clickOnLaptops();
		boolean flag = productpage.MacBookairtext();
		Assert.assertTrue(flag);
		
		
	}
		
	@Test(priority=5)
	public void validateMacBookairPriceTest() throws IOException{
		hp.clickOnLaptops();
		boolean flag = productpage.MacBookairPrice();
		Assert.assertTrue(flag);		
	}
	
	@Test(priority=6)
	public void validaateMacbookairAddToCartTest() throws IOException{
		hp.clickOnLaptops();
		productpage.macAddToCart();
	    		
	}
	
	// AsusMonitor
	
	@Test(priority=7)
	public void validaateAsusTextTest() throws IOException{
		hp.clickOnMonitors();
		boolean flag = productpage.Asustext();
		Assert.assertTrue(flag);
	}		
	
	@Test(priority=8)
	public void validateAsusPriceTest() throws IOException{
		hp.clickOnMonitors();
		boolean flag = productpage.AsusPrice();		
	}
	
	@Test(priority=9)
	public void vallidateAsusCartTest() throws IOException{
		hp.clickOnMonitors();
		productpage.asusAddToCart();	
	}
	
	
	@Test(priority=10)
	public void validateDeleteAsusMonitorTest() throws IOException, InterruptedException{
		hp.clickOnLoginLink();
		hp.LoginFunctionality(prop.getProperty("userName"), prop.getProperty("password"));
		hp.clickOnMonitors();
		productpage.asusAddToCart();
		Utility.explicitlyWait();			
		
		hp.clickOnCartLink();
		Thread.sleep(2000);
		//Utility.explicitlyWait();
		
		driver.navigate().refresh();
		cp.clickDeleteAsusMonitor();
	}		
	
	@Test(dataProvider="dpMethod", priority=1)	
	public void validateUserPurchaseOrderDetails(String name, String country, String city, CharSequence[] card, String month, CharSequence[] year ) throws IOException{
		hp.clickOnLoginLink();
		hp.LoginFunctionality(prop.getProperty("userName"), prop.getProperty("password"));
		cp = hp.clickOnCartLink();
		cp.clickOnPlaceOrder();
		cp.UserDetails(name, country, city, card, month, year);
	}
	
	@DataProvider()
	public Object[][] dpMethod() throws IOException{
		
		Object[][] obj = ExcelUtility.ExcelDataReader("UserDetails");
		return obj;
	}
		
}
