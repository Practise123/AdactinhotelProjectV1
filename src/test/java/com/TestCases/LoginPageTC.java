package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BasePage.BasePage;
import com.Objects.LoginPageObjects;

public class LoginPageTC extends BasePage
{
	@Test
	public static void loginPage()
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id(LoginPageObjects.txt_username)).sendKeys("Deepadam");
		driver.findElement(By.id(LoginPageObjects.txt_password)).sendKeys("Test@123");
		driver.findElement(By.id(LoginPageObjects.btn_login)).click();
	}
	
}
