package testCase;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import commonFunctions.CommonFunctions;
import pageObjectModel.Search_Hoel_Page_Objects;

public class Test_Search_Hotel extends CommonFunctions{
	public void login() {
		PageFactory.initElements(driver,Search_Hoel_Page_Objects.class);
		Search_Hoel_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		Search_Hoel_Page_Objects.passWord.sendKeys(properties.getProperty("password"));
		Search_Hoel_Page_Objects.loginBtn.click();
	}
	public void bookingDetails() {
		Select location = new Select(Search_Hoel_Page_Objects.Location);
		location.selectByVisibleText(properties.getProperty("location"));
		
		Select hotel = new Select(Search_Hoel_Page_Objects.Hotel);
		hotel.selectByVisibleText(properties.getProperty("hotels"));

		Select noOfRoom = new Select(Search_Hoel_Page_Objects.noOfRooms);
		noOfRoom.selectByVisibleText(properties.getProperty("noOfRoom"));
		
		Search_Hoel_Page_Objects.checkIn.sendKeys(properties.getProperty("chechin"));
		Search_Hoel_Page_Objects.checkOut.sendKeys(properties.getProperty("checkout"));
		
		Select adultPerRoom = new Select(Search_Hoel_Page_Objects.noOfAdult);
		adultPerRoom.selectByVisibleText(properties.getProperty("adultPerRoom"));
	}
	@Test
	public void searchHotel() {
		login();
		bookingDetails();
		Search_Hoel_Page_Objects.searchBtn.click();
	}
}
