package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutocompleteTextFieldPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html";
	
	public AutocompleteTextFieldPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
