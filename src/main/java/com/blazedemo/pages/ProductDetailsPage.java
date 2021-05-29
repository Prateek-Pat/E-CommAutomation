package com.blazedemo.pages;

import java.io.IOException;





import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.blazedemo.base.Base;
import com.blazedemo.utils.Utility;

public class ProductDetailsPage extends Base {
	

	public Alert alert;
	WebDriverWait wait = new WebDriverWait(driver, 5);
	
	
	public ProductDetailsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	// 2) WebElements
	
	// Phone
	@FindBy(xpath ="//h2[contains(text(),'Nokia lumia 1520')]")
	WebElement NokiaLumia;
	
	@FindBy(xpath = "//h3[@class='price-container']")
	WebElement NokiaLumiaPrice;
	
	@FindBy(xpath = "//a[@onclick='addToCart(2)']")
	WebElement NokiaAddToCartbtn;
	
	
	// Laptop
	@FindBy(xpath ="//h2[contains(text(),'MacBook air')]")
	WebElement MacBookair;
	
	@FindBy(xpath = "//h3[@class='price-container']")
	WebElement MacBookairPrice;
	
	@FindBy(xpath = "//a[@onclick='addToCart(11)']")
	WebElement MacAddToCartbtn;
	
	
	// Monitors
	@FindBy(xpath ="//h2[contains(text(),'ASUS Full HD')]")
	WebElement Asus;
	
	@FindBy(xpath = "//h3[@class='price-container']")
	WebElement AsusPrice;
	
	@FindBy(xpath = "//a[@onclick='addToCart(14)']")
	WebElement AsusAddToCartbtn;
		
	
	// 3) Actions
	
	//Nokia
	public boolean NokiaLumiatext(){
		return NokiaLumia.isDisplayed();		
	}
	
	public boolean NokiaPrice(){
		return NokiaLumiaPrice.isDisplayed();
		
	}
	
	public void AddToCart(){
		NokiaAddToCartbtn.click();
		//driver.switchTo().alert().accept();
		Utility.explicityWait();
	}
	
	// MacBook
	public boolean MacBookairtext(){
		return MacBookair.isDisplayed();		
	}
	
	public boolean MacBookairPrice(){
		return MacBookairPrice.isDisplayed();
		
	}
	
	public void macAddToCart(){
		MacAddToCartbtn.click();
		//driver.switchTo().alert().accept();	
		Utility.explicityWait();
	}
	
	// Asus
	public boolean Asustext(){
		return Asus.isDisplayed();		
	}
	
	public boolean AsusPrice(){
		return AsusPrice.isDisplayed();
		
	}
	
	public void asusAddToCart(){
		AsusAddToCartbtn.click();
		Utility.explicityWait();
		
	/*	//wait = new WebDriverWait(driver, 5);
		alert  = wait.until(ExpectedConditions.alertIsPresent());
		alert = driver.switchTo().alert();
		alert.accept();*/
		
		/*String alrtText = driver.switchTo().alert().getText();
		System.out.println(alrtText)*/;	
			
		//driver.switchTo().alert().accept();	
	}		
}
