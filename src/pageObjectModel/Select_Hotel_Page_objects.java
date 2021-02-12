package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Select_Hotel_Page_objects {

	@FindBy(id="radiobutton_1")
	public static WebElement radioBtn;
	
	@FindBy(id="continue")
	public static WebElement contBtn;
	
	
}
