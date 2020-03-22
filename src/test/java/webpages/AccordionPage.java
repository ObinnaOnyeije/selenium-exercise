package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordionPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Accordion/index.html";
	
	public AccordionPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
