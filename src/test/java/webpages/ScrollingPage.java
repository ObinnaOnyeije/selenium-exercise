package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollingPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Scrolling/index.html";
	
	@FindBy(id="zone1")
	private WebElement zone1;
	
	@FindBy(id="zone2")
	private WebElement zone2;
	
	@FindBy(id="zone3")
	private WebElement zone3;
	
	@FindBy(id="zone4")
	private WebElement zone4;
	
	public ScrollingPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
