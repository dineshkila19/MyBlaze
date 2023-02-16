package com.demoBlaze.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoBlaze.base.BaseClass;
import com.demoBlaze.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass{
	IndexPage indexPage;
	
	@BeforeClass
	public void setUp() {
		launchApp();
	}
	
	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void verifyMyLogo() {
		IndexPage indexPage=new IndexPage();
		boolean result=indexPage.validateMyLogo();
		Assert.assertTrue(result);
	}
	
	
	
	
	
	
	
	
	
	
	

}
