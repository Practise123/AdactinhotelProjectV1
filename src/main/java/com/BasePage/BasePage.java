package com.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage 
{
    public static WebDriver driver;
    
    
    @BeforeClass
    public static void setUp()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://www.adactin.com/HotelApp/");
    }
    
   @AfterClass
    public static void tearDown()
    {
    	driver.quit();
    }
}
