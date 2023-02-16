package com.demoBlaze.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoBlaze.actiondriver.Action;
import com.demoBlaze.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//*[@class='list-group']/a[3]")
	WebElement laptops;
	
	@FindBy(xpath="//*[@class='list-group']/a[2]")
	WebElement phones;
	
	@FindBy(xpath="//*[@class='list-group']/a[4]")
	WebElement monitors;
	
	@FindBy(xpath="//*[@class='row']/div[3]/div[1]/a/img")
	WebElement macBook;
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	WebElement selectAddToCart;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public AddToCartPage selectLaptops() throws Throwable {
		Action.click(getDriver(), laptops);
		Action.click(getDriver(), macBook);
		Action.click(getDriver(), selectAddToCart);
		Action.Alert(getDriver());
		return new AddToCartPage();
	}
	
	
	
	
	
	
	
	
	
	
	

}
