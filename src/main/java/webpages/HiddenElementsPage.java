package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HiddenElementsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Hidden-Elements/index.html";
	
	public HiddenElementsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
