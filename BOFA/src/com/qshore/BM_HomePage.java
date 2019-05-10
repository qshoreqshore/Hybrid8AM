package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BM_HomePage {
	
	public @FindBy(xpath="//*[@id='REGISTERED_BY']") WebElement profilefor;
	public @FindBy(xpath="//*[@id='NAME']") WebElement name;
	public @FindBy(xpath="//*[@id='RELIGION']") WebElement religion;
	public @FindBy(xpath="//a[@title='Telugu Matrimony']") WebElement teluguLink;
	
	
	
	
	

}
