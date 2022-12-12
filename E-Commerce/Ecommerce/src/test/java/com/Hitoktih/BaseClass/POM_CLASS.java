package com.Hitoktih.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_CLASS 
{

@FindBy(xpath="//a[@title='My Account']")
private WebElement My_Account;

public POM_CLASS(WebDriver driver)
{
	
PageFactory.initElements(driver, this);
}

public WebElement My_Acc()
{
	return My_Account;
}

}
