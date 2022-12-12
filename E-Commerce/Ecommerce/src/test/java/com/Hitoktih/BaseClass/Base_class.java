package com.Hitoktih.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class 
{public static WebDriver driver;
public static Properties config;
public static 	WebDriverWait wait;
public static POM_CLASS pom;


@BeforeMethod
public static void setup() throws IOException
{
	config=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\USHA PRAMOD\\E-Commerce\\Ecommerce\\src\\test\\resources\\config.properties");
	config.load(fis);
	
	
	
	if(config.getProperty("browser").equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	else
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	driver.get(config.getProperty("url"));
	driver.manage().window().maximize();
	wait=new WebDriverWait(driver, 5);
	
}

public static void dropdown(WebElement address,String value)
{
	Select sel=new Select(address);
	sel.selectByValue(value);
}


@AfterMethod
public static void tear_down()
{
	driver.close();
}
}
