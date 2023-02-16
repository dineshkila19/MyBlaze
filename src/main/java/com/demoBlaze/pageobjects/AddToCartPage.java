package com.demoBlaze.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoBlaze.actiondriver.Action;
import com.demoBlaze.base.BaseClass;

public class AddToCartPage extends BaseClass{
	
	@FindBy(xpath="//*[@class='navbar-collapse']/ul/li[4]/a")
	WebElement cartBtn;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	WebElement placeOrderBtn;
	
	public AddToCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public PlaceOrderPage selectCart() {
		Action.click(getDriver(), cartBtn);
		Action.click(getDriver(), placeOrderBtn);
		return new PlaceOrderPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
