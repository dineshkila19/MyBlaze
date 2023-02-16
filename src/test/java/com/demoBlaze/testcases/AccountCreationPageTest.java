package com.demoBlaze.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoBlaze.base.BaseClass;
import com.demoBlaze.pageobjects.AccountCreationPage;
import com.demoBlaze.pageobjects.IndexPage;

public class AccountCreationPageTest extends BaseClass{
	IndexPage indexPage;
	AccountCreationPage accountCreationPage;
	
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	
	
	@Test
	public void creatingAccount() throws Throwable {
		IndexPage indexPage=new IndexPage();
		accountCreationPage=indexPage.clickOnSignIn();
		accountCreationPage.accountCreat(prop.getProperty("username"), prop.getProperty("password"));
		accountCreationPage.acceptAlert();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
