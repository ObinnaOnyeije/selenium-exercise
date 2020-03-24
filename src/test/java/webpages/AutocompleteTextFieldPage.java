package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutocompleteTextFieldPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html";
	
	@FindBy(id="myInput")
	private WebElement inputField;
	
	@FindBy(id="submit-button")
	private WebElement submitButton;
	
	@FindBy(id="myInputautocomplete-list")
	private WebElement autocompleteListElement;
	
	public AutocompleteTextFieldPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
