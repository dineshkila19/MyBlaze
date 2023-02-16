package com.demoBlaze.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoBlaze.base.BaseClass;
import com.demoBlaze.pageobjects.HomePage;
import com.demoBlaze.pageobjects.IndexPage;
import com.demoBlaze.pageobjects.LoginPage;

public class LoginPageTest extends BaseClass{
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
	

	@DataProvider(name="Credentials")
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		data[0][0]="dineshkila@gmail.com";
		data[0][1]="dinesh19";
		
		data[1][0]="dineshkila1@gmail.com";
		data[1][1]="dinesh";
		
		data[2][0]="dineshkila@gmail.com";
		data[2][1]="DINESH";
		
		return data;
		
		
	}
	
	@Test(dataProvider = "Credentials")
	public void LoginTest() {
//		loginPage=indexPage.clickOnLogin();
//		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		IndexPage indexPage=new IndexPage();
		loginPage=indexPage.clickOnLogin();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
}
