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
	
//	@FindBy(id="player")
//	private WebElement player;
//	
//	@FindBy(id="udemy-promo-code-webdriverio")
//	private WebElement webDriverIOLink;
//	
//	@FindBy(id="udemy-promo-code-cucumber")
//	private WebElement cucumberLink;
	
	@FindBy(id="contact-us")
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
	private WebElement dropdownCheckboxesRadioButtonsLink;
	
	@FindBy(id="ajax-loader")
	private WebElement ajaxLoaderLink;
	
	@FindBy(id="actions")
	private WebElement actionsLink;
	
	@FindBy(id="scrolling-around")
	private WebElement scrollingLink;
	
	@FindBy(id="popup-alerts")
	private WebElement popupAlertsLink;
	
	@FindBy(id="iframe")
	private WebElement iFrameLink;
	
	@FindBy(id="hidden-elements")
	private WebElement hiddenElementsLink;
	
	@FindBy(id="data-table")
	private WebElement dataTableLink;
	
	@FindBy(id="autocomplete-textfield")
	private WebElement autocompleteTextFieldLink;
	
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
	
	public LoginPortalPage clickLoginPortalLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(loginPortalLink));
		loginPortalLink.click();
		return new LoginPortalPage(driver);
	}
	
	public ClickButtonsPage clickClickButtonsLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(buttonClicksLink));
		buttonClicksLink.click();
		return new ClickButtonsPage(driver);
	}
	
	public ToDoListPage clickToDoListLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(toDoListLink));
		toDoListLink.click();
		return new ToDoListPage(driver);
	}
	
	public PageObjectModelPage clickPageObjectModelLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(pageObjectModelLinks.get(0)));
		pageObjectModelLinks.get(0).click();
		return new PageObjectModelPage(driver);
	}
	
	public AccordionPage clickAccordionLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(pageObjectModelLinks.get(1)));
		pageObjectModelLinks.get(1).click();
		return new AccordionPage(driver);
	}
	
	public DropdownCheckboxesRadioButtonsPage clickDropdownCheckboxesRadioButtonsLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(dropdownCheckboxesRadioButtonsLink));
		dropdownCheckboxesRadioButtonsLink.click();
		return new DropdownCheckboxesRadioButtonsPage(driver);
	}
	
	public AjaxLoaderPage clickAjaxLoaderLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(ajaxLoaderLink));
		ajaxLoaderLink.click();
		return new AjaxLoaderPage(driver);
	}
	
	public ActionsPage clickActionsLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(actionsLink));
		actionsLink.click();
		return new ActionsPage(driver);
	}
	
	public ScrollingPage clickScrollingLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(scrollingLink));
		scrollingLink.click();
		return new ScrollingPage(driver);
	}
	
	public PopupAlertsPage clickPopupAlertsLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(popupAlertsLink));
		popupAlertsLink.click();
		return new PopupAlertsPage(driver);
	}
	
	public IFramePage clickIFrameLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(iFrameLink));
		iFrameLink.click();
		return new IFramePage(driver);
	}
	
	public HiddenElementsPage clickHiddenElementsLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(hiddenElementsLink));
		hiddenElementsLink.click();
		return new HiddenElementsPage(driver);
	}
	
	public DataTablePage clickDataTableLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(dataTableLink));
		dataTableLink.click();
		return new DataTablePage(driver);
	}
	
	public AutocompleteTextFieldPage clickAutocompleteTextFieldLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(autocompleteTextFieldLink));
		autocompleteTextFieldLink.click();
		return new AutocompleteTextFieldPage(driver);
	}
	
	public FileUploadPage clickFileUploadLink() {
		WebDriverWait await = new WebDriverWait(driver, 10);
		await.until(ExpectedConditions.visibilityOf(fileUploadLink));
		fileUploadLink.click();
		return new FileUploadPage(driver);
	}
	
}
