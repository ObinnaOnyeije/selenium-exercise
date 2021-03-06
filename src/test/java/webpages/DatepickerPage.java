package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatepickerPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Datepicker/index.html";
	
	@FindBy(id="datepicker")
	private WebElement datepicker;
	
	public DatepickerPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
