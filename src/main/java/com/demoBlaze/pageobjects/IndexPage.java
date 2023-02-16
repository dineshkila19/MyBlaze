package com.demoBlaze.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoBlaze.actiondriver.Action;
import com.demoBlaze.base.BaseClass;

public class IndexPage extends BaseClass{
	
	@FindBy(xpath="//div[@class='navbar-collapse']/ul/li[5]/a")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='navbar-collapse']/ul/li[8]/a")
	WebElement signInBtn;
	
	@FindBy(xpath="//body/nav[@id='narvbarx']/a[@id='nava']/img[1]")
	WebElement myLogo;
	
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateMyLogo() {
		return Action.isDisplayed(getDriver(), myLogo);
	}
	
	public AccountCreationPage clickOnSignIn() {
		Action.click(getDriver(), signInBtn);
		return new AccountCreationPage();
	}
	
	public LoginPage clickOnLogin() {
		Action.click(getDriver(), loginBtn);
		return new LoginPage();
	}

}
