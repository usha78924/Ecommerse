package com.Hitoktih.TestScripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Hitoktih.BaseClass.Base_class;
import com.Hitoktih.BaseClass.POM_CLASS;

public class Registration_TestScripts extends Base_class
{
@Test
public static void Registration_TestScripts() throws InterruptedException
{
	Assert.assertTrue(driver.getTitle().contains("Your Store"),"Title is not matching");
	pom=new POM_CLASS(driver);
	pom.My_Acc().click();
	Thread.sleep(3000);
WebElement dropdown = pom.My_Acc();
dropdown(dropdown,"1");
	Thread.sleep(5000);
}
}
