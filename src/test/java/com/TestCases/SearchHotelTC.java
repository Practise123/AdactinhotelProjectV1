package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.BasePage.BasePage;
import com.Objects.SearchHotelPage;

public class SearchHotelTC extends BasePage
{

	@Test
	public static void searchHotel()
	{
		//LoginPageTC lp = new LoginPageTC();
		//LoginPageTC.loginPage();
		
		WebElement selectLoc = driver.findElement(By.id(SearchHotelPage.drpdwn_Location));
		Select drpdwnLoc = new Select(selectLoc);
		drpdwnLoc.selectByVisibleText("London");
		
		WebElement selectHotels = driver.findElement(By.id(SearchHotelPage.drpdwn_Hotels));
		Select drpdwnHotels = new Select(selectHotels);
		drpdwnHotels.selectByVisibleText("Hotel Hervey");
		
		WebElement selectRoomType = driver.findElement(By.id(SearchHotelPage.drpdwn_RoomType));
		Select drpdwnRoomType = new Select(selectRoomType);
		drpdwnRoomType.selectByValue("Double");
		
		WebElement selectNoRooms = driver.findElement(By.id(SearchHotelPage.drpdwn_NoOfRooms));
		Select drpdwnNoRooms = new Select(selectNoRooms);
		drpdwnNoRooms.selectByValue("4");
		
		WebElement textChkIndate = driver.findElement(By.id(SearchHotelPage.txt_chkInDate));
		textChkIndate.clear();
		textChkIndate.sendKeys("06/08/2019");
		
		WebElement textChkOutdate = driver.findElement(By.id(SearchHotelPage.txt_chkOutDate));
		textChkOutdate.clear();
		textChkOutdate.sendKeys("20/08/2019");
		
		WebElement selectAdultsPerRoom = driver.findElement(By.id(SearchHotelPage.drpdwn_adultsPerRoom));
		Select drpdwnAdultsPerRoom = new Select(selectAdultsPerRoom);
		drpdwnAdultsPerRoom.selectByValue("2");
		
		WebElement selectChildrenPerRoom = driver.findElement(By.id(SearchHotelPage.drpdwn_ChildrenPerRoom));
		Select drpdwnChildrenPerRoom = new Select(selectChildrenPerRoom);
		drpdwnChildrenPerRoom.selectByValue("2");
		
		WebElement btnSearch = driver.findElement(By.id(SearchHotelPage.btn_search));
		btnSearch.click();
		
		
		
	}
}
