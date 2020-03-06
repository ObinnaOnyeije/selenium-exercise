package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageObject {

	private static String url = "http://webdriveruniversity.com/index.html";
	
	@FindBy(id="player")
	private WebElement player;
	
//	@FindBy(id="udemy-promo-code-webdriverio")
//	private WebElement webDriverIOLink;
//	
//	@FindBy(id="udemy-promo-code-cucumber")
//	private WebElement cucumberLink;
	
//	@FindBy(id="contact-us")
//	private WebElement contactUsLink;
	
	@FindBy(xpath="//*[@id=\"contact-us\"]")
	private WebElement contactUsLink;
	
	@FindBy(id="login-portal")
	private WebElement loginPortalLink;
	
	@FindBy(id="button-clicks")
	private WebElement buttonClicksLink;
	
	@FindBy(id="to-do-list")
	private WebElement toDoListLink;
	
	@FindAll({
		@FindBy(id="page-object-model")
	})
	private List<WebElement> pageObjectModelLinks;
	
	@FindBy(id="dropdown-checkboxes-radiobuttons")
	private WebElement dropdownCheckboxesRadiobuttonsLink;
	
	@FindBy(id="ajax-loader")
	private WebElement ajaxLoaderLink;
	
	@FindBy(id="actions")
	private WebElement actionsLink;
	
	@FindBy(id="scrolling-around")
	private WebElement scrollingAroundLink;
	
	@FindBy(id="popup-alerts")
	private WebElement popupAlertsLink;
	
	@FindBy(id="iframe")
	private WebElement iframeLink;
	
	@FindBy(id="hidden-elements")
	private WebElement hiddenElementsLink;
	
	@FindBy(id="data-table")
	private WebElement dataTableLink;
	
	@FindBy(id="autocomplete-textfield")
	private WebElement autocompleteTextfieldLink;
	
	@FindBy(id="file-upload")
	private WebElement fileUploadLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static String getURL() {
		return url;
	}
	
	public ContactUsPage clickContactUsLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(contactUsLink));
		contactUsLink.click();
		return new ContactUsPage(driver);
	}
}
