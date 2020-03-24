package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormThankYouPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Contact-Us/contact-form-thank-you.html";
	
	@FindBy(id="contact_reply")
	private WebElement contactReply;
	
	@FindBy(id="fountainG")
	private WebElement fountain;
	
	public ContactFormThankYouPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
