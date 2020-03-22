package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrollingPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Scrolling/index.html";
	
	public ScrollingPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
