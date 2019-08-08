package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.BasePage.BasePage;
import com.Objects.BookAHotelPage;


public class BookAHotelTC extends BasePage
{

	@Test
	public static void bookAHotel()
	{
		LoginPageTC.loginPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SearchHotelTC.searchHotel();
		SelectHotelTC.selectHotel();
		
		WebElement textfirstName = driver.findElement(By.id(BookAHotelPage.txt_firstName));
		textfirstName.sendKeys("TestFN1");
		
		WebElement textLastName = driver.findElement(By.id(BookAHotelPage.txt_LastName));
		textLastName.sendKeys("TestLN1");
		
		WebElement textBillingAddress = driver.findElement(By.id(BookAHotelPage.txt_billingAddress));
		textBillingAddress.sendKeys("Test Street");
		
		WebElement textCreditCardNo = driver.findElement(By.id(BookAHotelPage.txt_creditCardNo));
		textCreditCardNo.sendKeys("7843216780123145");
		
		WebElement selectCCType = driver.findElement(By.id(BookAHotelPage.drpdwn_creditCardType));
		Select drpdwncreditCardType = new Select(selectCCType);
		drpdwncreditCardType.selectByVisibleText("VISA");
		
		WebElement selectExpiryMonth = driver.findElement(By.id(BookAHotelPage.drpdwn_expiryMonth));
		Select drpdwnexpiryMonth = new Select(selectExpiryMonth);
		drpdwnexpiryMonth.selectByVisibleText("March");
		
		WebElement selectExpiryYear = driver.findElement(By.id(BookAHotelPage.drpdwn_expiryYear));
		Select drpdwnexpiryYear = new Select(selectExpiryYear);
		drpdwnexpiryYear.selectByVisibleText("2021");
		
		WebElement textCVVNo = driver.findElement(By.id(BookAHotelPage.txt_cvvNo));
		textCVVNo.sendKeys("7843216780123145");
		
		WebElement btnBookNow = driver.findElement(By.id(BookAHotelPage.btn_bookNow));
		btnBookNow.click();
		
		String textOrderNo = driver.findElement(By.id("order_no")).getText();
		if(textOrderNo!=null)
		{
			System.out.println("Booked a room successfully!!!");
		}
		
		LogoutTC.logout();
		
		String loggedoutMessage = driver.findElement(By.xpath("//td[contains(text(),'You have successfully logged out.')]")).getText();
		System.out.println(loggedoutMessage);
	
	}
	
}
