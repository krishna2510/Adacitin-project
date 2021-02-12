package testCase;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjectModel.Book_Hotel_Page_Objects;

public class Test_Book_Hotel extends CommonFunctions{
	
	public void userDetail() {
		PageFactory.initElements(driver, Book_Hotel_Page_Objects.class);
		Book_Hotel_Page_Objects.firstName.sendKeys(properties.getProperty("firstname"));
		Book_Hotel_Page_Objects.lastName.sendKeys(properties.getProperty("lastname"));
		Book_Hotel_Page_Objects.address.sendKeys(properties.getProperty("address"));
		Book_Hotel_Page_Objects.ccNo.sendKeys(properties.getProperty("creditcardno"));
	}
	public void cardDetails() {
		Select cardType = new Select(Book_Hotel_Page_Objects.ccType);
		cardType.selectByVisibleText(properties.getProperty("cctype"));
		Select expMonth = new Select(Book_Hotel_Page_Objects.expMonth);
		expMonth.selectByVisibleText(properties.getProperty("expirymonth"));
		Select expYear = new Select(Book_Hotel_Page_Objects.expYear);
		expYear.selectByVisibleText(properties.getProperty("expiryyear"));
		Book_Hotel_Page_Objects.cvvNo.sendKeys(properties.getProperty("cvv"));
	}
	@Test
	public void bookHotel() {
		userDetail();
		cardDetails();
		Book_Hotel_Page_Objects.submit.click();
}
}