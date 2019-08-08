package com.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BasePage.BasePage;
import com.Objects.LogoutPage;

public class LogoutTC extends BasePage
{

	@Test
	public static void logout()
	{
		driver.findElement(By.id(LogoutPage.btn_logout)).click();
	}
}
