package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickButtonsPage extends PageObject {
	
	private static String url = "http://webdriveruniversity.com/Click-Buttons/index.html";

	@FindBy(id="button1")
	private WebElement button1;
	
	@FindBy(id="button2")
	private WebElement button2;
	
	@FindBy(id="button3")
	private WebElement button3;
	
	public ClickButtonsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}

}
