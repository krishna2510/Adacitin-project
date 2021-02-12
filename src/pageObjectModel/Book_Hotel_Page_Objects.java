package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Book_Hotel_Page_Objects {

	@FindBy(id="first_name")
	public static WebElement firstName;
	
	@FindBy(id="last_name")
	public static WebElement lastName;
	
	@FindBy(id="address")
	public static WebElement address;
	
	@FindBy(id="cc_num")
	public static WebElement ccNo;
	
	@FindBy(id="cc_type")
	public static WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	public static WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	public static WebElement expYear;
	
	@FindBy(id="cc_cvv")
	public static WebElement cvvNo;
	
	@FindBy(id="book_now")
	public static WebElement submit;
}
