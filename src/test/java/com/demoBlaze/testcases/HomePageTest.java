package com.demoBlaze.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoBlaze.base.BaseClass;
import com.demoBlaze.pageobjects.HomePage;
import com.demoBlaze.pageobjects.IndexPage;
import com.demoBlaze.pageobjects.LoginPage;

public class HomePageTest extends BaseClass {
	
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void selectMacBook() throws Throwable {
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnLogin();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		homePage.selectLaptops();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
