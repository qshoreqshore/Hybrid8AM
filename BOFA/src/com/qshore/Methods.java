package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods {
	
	public WebDriver driver;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	public Select s1;
	
	// Method Name : launchApp
	// Descrition  : To launch App
	// Author      : Kishore Kumar
    // Date        : 05042019
	// Arguments   : String url, String sspath;
	//************************************************
	public void launchApp(String url, String sspath)throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));}
	//************************************************
	public void closeApp(){
		driver.close();	}
	//************************************************
	public void excelCon(String path, String sname)throws Exception {
		f=new FileInputStream(path);
		wb=Workbook.getWorkbook(f);
		s=wb.getSheet(sname);	}
	//************************************************
	public void elementPresent(WebElement element, boolean exp, String sspath) throws Exception{
		boolean a=element.isDisplayed();
		if(a==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//*****************************************************
	public void elementsCount(String loc, int exp, String sspath)throws Exception {
		List<WebElement> a=driver.findElements(By.tagName(loc));
		if(a.size()==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//****************************************************************************
	public void titleContains(String text, boolean exp){
		String title=driver.getTitle();
		if(title.contains(text)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
			}
	//************************************************************************
	public void titleLemgth(int exp){
		String title=driver.getTitle();
		if(title.length()==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");	}
	//**********************************************************************
	public void selectValueIndex(WebElement element, int index){
		s1=new Select(element);
		s1.selectByIndex(index);
	}
	//***************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
