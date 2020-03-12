package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopupAlertsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Popup-Alerts/index.html";
	
	public PopupAlertsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
