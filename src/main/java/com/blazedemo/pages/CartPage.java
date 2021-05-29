package com.blazedemo.pages;

import java.io.IOException;





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
	@FindBy(xpath="//div[@class='table-responsive'] //tr[3] //a[contains(text(),'Delete')]")
	WebElement AsusMonitorDeleteBtn;
	
	
	//Actions
	public void clickDeleteAsusMonitor(){
		AsusMonitorDeleteBtn.click();
		
	}

}
			

