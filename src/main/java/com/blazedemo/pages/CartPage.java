package com.blazedemo.pages;

import java.io.IOException;











import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blazedemo.base.Base;

public class CartPage extends Base{
	
	
	//Constructor
	public CartPage() throws IOException {
		PageFactory.initElements(driver, this);	
	}

	//WebElement	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-striped']/tbody/tr/td//a[contains(text(),'Delete')]")
	
	//table[@class='table table-bordered table-hover table-striped']/tbody/tr/td[4]
	WebElement AsusMonitorDeleteBtn;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	WebElement placeOrder; 
	
	@FindBy(xpath="//label[contains(text(),'Total: 650')]")
	WebElement totalPrice;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement Name;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement Country;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@id='card']")
	WebElement creditCard;
	
	@FindBy(xpath="//input[@id='month']")
	WebElement Month;
	
	@FindBy(xpath="//input[@id='year']")
	WebElement Year;
	
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
	WebElement Purchase;
	
	
	//Actions
	public void clickDeleteAsusMonitor(){
		AsusMonitorDeleteBtn.click();		
	}
	
	public void clickOnPlaceOrder(){
		placeOrder.click();
	}

	public void checkPrice(){
		
		boolean flag = totalPrice.isDisplayed();
	}
	
	public void UserDetails(String name, String country, String city, CharSequence[] card, String month, CharSequence[] year2 ){
		Name.sendKeys(name);
		Country.sendKeys(country);
		City.sendKeys(city);
		creditCard.sendKeys(card);
		Month.sendKeys(month);
		Year.sendKeys(year2);
		Purchase.click();
		
	}
	
}
			

