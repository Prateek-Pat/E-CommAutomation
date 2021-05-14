package com.blazedemo.pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blazedemo.base.Base;

public class ProductDetailsPage extends Base {
	

	public ProductDetailsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	// 2) WebElements
	
	@FindBy(xpath ="//h2[contains(text(),'Nokia lumia 1520')]")
	WebElement NokiaLumia;
	
	@FindBy(xpath = "//h3[@class='price-container']")
	WebElement NokiaLumiaPrice;
	
	@FindBy(xpath = "//a[@onclick='addToCart(2)']")
	WebElement AddToCartbtn;
	
	// 3) Actions
	
	public boolean NokiaLumiatext(){
		return NokiaLumia.isDisplayed();		
	}
	
	public boolean NokiaPrice(){
		return NokiaLumiaPrice.isDisplayed();
		
	}
	
	public void AddToCart(){
		AddToCartbtn.click();
		driver.switchTo().alert().accept();	
	}
	
	
	

}
