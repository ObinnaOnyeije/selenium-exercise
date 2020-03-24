package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownCheckboxesRadioButtonsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
	
	@FindBy(id="dropdown-menu-1")
	private WebElement dropdownMenu1;
	
	@FindBy(id="dropdown-menu-2")
	private WebElement dropdownMenu2;
	
	@FindBy(id="dropdown-menu-3")
	private WebElement dropdownMenu3;
	
	@FindBy(id="checkboxes")
	private WebElement checkboxes;
	
	@FindBy(id="radio-buttons")
	private WebElement radioButtons;
	
	@FindBy(id="radio-buttons-selected-disabled")
	private WebElement radioButtonsSelectedDisabled;
	
	@FindBy(id="fruit-selects")
	private WebElement fruitSelectssDropdown;
	
	public DropdownCheckboxesRadioButtonsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
