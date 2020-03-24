package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopupAlertsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Popup-Alerts/index.html";
	
	@FindBy(id="button1")
	private WebElement button1;
	
	@FindBy(id="button2")
	private WebElement button2;
	
	@FindBy(id="button3")
	private WebElement button3;
	
	@FindBy(id="button4")
	private WebElement button4;
	
	public PopupAlertsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
