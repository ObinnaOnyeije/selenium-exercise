package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownCheckboxesRadioButtonsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
	
	public DropdownCheckboxesRadioButtonsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
