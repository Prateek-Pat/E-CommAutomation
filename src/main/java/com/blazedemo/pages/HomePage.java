package com.blazedemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blazedemo.base.Base;

public class HomePage extends Base{
	
/*
	// 1) Constructor 
	// 2) WebElement
	// 3) Actions
*/
	
	// 1) Constructor
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);		
	}
	
	// 2) WebElements	
	// LoginForm
	@FindBy(xpath = "//a[@id='login2']")
	WebElement loginLink;
	
	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement UserName;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@onclick='logIn()']")
	WebElement LogInBtn;
		
	//SingUp Form
	@FindBy(xpath = "//a[@id='signin2']")
	WebElement SingUpLink;
	
	@FindBy(xpath = "//input[@id='sign-username']")
	WebElement UserName1;
	
	@FindBy(xpath = "//input[@id='sign-password']")
	WebElement password2;
		
	@FindBy(xpath = "//button[@onclick='register()']")
	WebElement SingUpBtn;
	
	// ScrollingArrow	
	@FindBy(xpath ="//span[@class='carousel-control-next-icon']")
	WebElement scrollingArrow;
	
	
	//3) Actions	
	public void clickOnLoginLink(){
		loginLink.click();		
	}
	
	public void clickOnSingUpLink(){
		SingUpLink.click();
	}
		
	public HomePage SingUpFunctionality(String UN, String Pwd) throws IOException{
		UserName1.sendKeys(UN);
		password2.sendKeys(Pwd);
		SingUpBtn.click();
		
		return new HomePage();				
	}
	
	public HomePage LoginFunctionality(String UN, String Pwd) throws IOException{
		UserName.sendKeys(UN);
		Password.sendKeys(Pwd);
		LogInBtn.click();
		
		return new HomePage();
	}
	
	public void scrollingArrow(){
		scrollingArrow.click();		
	}
}
	
