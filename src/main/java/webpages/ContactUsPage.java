package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Contact-Us/contactus.html";
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstNameField;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastNameField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@name='message']")
	private WebElement messageField;
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
