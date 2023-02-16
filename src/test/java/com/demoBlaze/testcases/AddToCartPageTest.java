package com.demoBlaze.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoBlaze.base.BaseClass;
import com.demoBlaze.pageobjects.AddToCartPage;
import com.demoBlaze.pageobjects.HomePage;
import com.demoBlaze.pageobjects.IndexPage;
import com.demoBlaze.pageobjects.LoginPage;

public class AddToCartPageTest extends BaseClass{

	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	AddToCartPage addToCartPage;
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void AddToCartTest() throws Throwable {
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnLogin();
		Thread.sleep(3000);
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		addToCartPage=homePage.selectLaptops();
		Thread.sleep(3000);
		addToCartPage.selectCart();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
