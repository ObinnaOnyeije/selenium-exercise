package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HiddenElementsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Hidden-Elements/index.html";
	
	@FindBy(id="not-displayed")
	private WebElement notDisplayedElement;
	
	@FindBy(id="button1")
	private WebElement button1;
	
	@FindBy(id="visibility-hidden")
	private WebElement visibilityHiddenElement;
	
	@FindBy(id="button2")
	private WebElement button2;
	
	@FindBy(id="zero-opacity")
	private WebElement zeroOpacityElement;
	
	@FindBy(id="button3")
	private WebElement button3;
	
	public HiddenElementsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
