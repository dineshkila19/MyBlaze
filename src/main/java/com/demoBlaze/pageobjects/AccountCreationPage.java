package com.demoBlaze.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoBlaze.actiondriver.Action;
import com.demoBlaze.base.BaseClass;

public class AccountCreationPage extends BaseClass{
	
	@FindBy(xpath="//*[@id='sign-username']")
	WebElement txtUserName;
	
	@FindBy(xpath="//*[@id='sign-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[contains(text(),'Sign up')]")
	WebElement signUpBtn;
	
	public AccountCreationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void accountCreat(String uname, String pwd) throws Throwable {
		Action.type(txtUserName, uname);
		Action.type(txtPassword, pwd);
		Action.click(getDriver(), signUpBtn);
		
	}
	
	public LoginPage acceptAlert() {
		Alert alert1=getDriver().switchTo().alert();
		alert1.accept();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
