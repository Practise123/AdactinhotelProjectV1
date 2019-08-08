package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BasePage.BasePage;
import com.Objects.SelectHotelPage;

public class SelectHotelTC extends BasePage
{
	@Test
	public static void selectHotel()
	{
		
	/*	LoginPageTC.loginPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SearchHotelTC.searchHotel();*/
		driver.findElement(By.id(SelectHotelPage.rdbtn_Select)).click();
		driver.findElement(By.id(SelectHotelPage.btn_Continue)).click();
	}

}
