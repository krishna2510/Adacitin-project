package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjectModel.Select_Hotel_Page_objects;

public class Test_Select_Hotel extends CommonFunctions {

	@Test
	public void selectHotel() {
		PageFactory.initElements(driver, Select_Hotel_Page_objects.class);
		Select_Hotel_Page_objects.radioBtn.click();
		Select_Hotel_Page_objects.contBtn.click();
	}
}
