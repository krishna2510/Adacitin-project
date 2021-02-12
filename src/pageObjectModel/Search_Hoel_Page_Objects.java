package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_Hoel_Page_Objects {

	@FindBy(id="username")
	public static WebElement userName;
	
	@FindBy(id="password")
	public static WebElement passWord;
	
	@FindBy(id="login")
	public static WebElement loginBtn;
	
	@FindBy(id="location")
	public static WebElement Location;
	
	@FindBy(id="hotels")
	public static WebElement Hotel;
	
	@FindBy(id="room_nos")
	public static WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	public static WebElement checkIn;
	
	@FindBy(id="datepick_out")
	public static WebElement checkOut;
	
	@FindBy(id="adult_room")
	public static WebElement noOfAdult;
	
	@FindBy(id="Submit")
	public static WebElement searchBtn;
}
