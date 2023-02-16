package com.demoBlaze.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoBlaze.actiondriver.Action;
import com.demoBlaze.base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(id="loginusername")
	WebElement txtLoginUserName;
	
	@FindBy(id="loginpassword")
	WebElement txtLoginPassword;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String uname, String pwd) {
		Action.type(txtLoginUserName, uname);
		Action.type(txtLoginPassword, pwd);
		Action.click(getDriver(), loginBtn);
		return new HomePage();
	}
	
	
	
	
	

}
