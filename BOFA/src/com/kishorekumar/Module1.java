package com.kishorekumar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.BM_HomePage;
import com.qshore.Methods;

public class Module1 {
	
	// Test Case Name  : TC01
	// Test Name       : tc_01
	// Module Name     : Module1
	// Project Name	   : Matrimony
	// Author Name     : Kishore Kumar
	// Reviewd By      : 
	//*****************************************************************
	public void tc_01() throws Exception {
		// Importing Methods
		Methods m=new Methods();
		// Import Excel Con
		m.excelCon("C:\\Users\\apoorva\\Desktop\\Hybrid\\Test Data\\Kishore\\TC01.xls", "Sheet1");
		// Launching Matrimony app by passing URL
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\apoorva\\Desktop\\Hybrid\\Test Results\\Kishore\\tc01\\launchapp.png");
		// Importing Page Objects using Pagefactory
		BM_HomePage home=PageFactory.initElements(m.driver, BM_HomePage.class);
		// Verifying Profilefor and name delements available
		m.elementPresent(home.profilefor, true, "C:\\Users\\apoorva\\Desktop\\Hybrid\\Test Results\\Kishore\\tc01\\profileforavailable.png");
		m.elementPresent(home.name, true, "C:\\Users\\apoorva\\Desktop\\Hybrid\\Test Results\\Kishore\\tc01\\nameavaialable.png");
		// Verifying ProfileFor and Name
		m.titleContains("matrimony", true);
		m.titleLemgth(40);		
	    // Seleting profile for based on index
		m.selectValueIndex(home.profilefor, 3);
		// Verifying Religion
		m.elementPresent(home.religion, true, "C:\\Users\\apoorva\\Desktop\\Hybrid\\Test Results\\Kishore\\tc01\\Religion.png");
		// Verifying 5th Index value in Religion dropdown
		List<WebElement> values=home.religion.findElements(By.tagName("option"));
		if(values.get(4).getText().equals("Christian")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");		
		// Entering Name
		home.name.sendKeys(m.s.getCell(0,1).getContents());
		// Verifying Number Of Links and Images
		m.elementsCount("a", 20, "C:\\Users\\apoorva\\Desktop\\Hybrid\\Test Results\\Kishore\\tc01\\NumberofLinks.png");
		m.elementsCount("img", 40, "C:\\Users\\apoorva\\Desktop\\Hybrid\\Test Results\\Kishore\\tc01\\NumberofImages.png");
		
		// Clicking On Telugu Link
		home.teluguLink.click();
		// Creating WebdriverWait 
		WebDriverWait ww=new WebDriverWait(m.driver, 60);
		// Waiting until page navigates t telugu page
		ww.until(ExpectedConditions.titleContains("Telugu"));
		m.closeApp();
		//*****************************************************************************************************************************
		
		
		
		
		
		
		
		
		
		
		
	}

}
