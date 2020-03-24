package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordionPage extends PageObject {

	private static String url = "http://webdriveruniversity.com/Accordion/index.html";
	
	@FindBy(id="manual-testing-accordion")
	private WebElement manualTestingAccordion;
	
	@FindBy(id="manual-testing-description")
	private WebElement manualTestingDescription;
	
	@FindBy(id="cucumber-accordion")
	private WebElement cucumberAccordion;
	
	@FindBy(id="cucumber-testing-description")
	private WebElement cucumberTestingDescription;
	
	@FindBy(id="automation-accordion")
	private WebElement automationAccordion;
	
	@FindBy(id="automation-testing-description")
	private WebElement automationTestingDescription;
	
	@FindBy(id="click-accordion")
	private WebElement timeoutAccordion;
	
	@FindBy(id="timeout")
	private WebElement timeoutTestingDescription;
	
	@FindBy(id="text-appear-box")
	private WebElement textAppearBox;
	
	public AccordionPage(WebDriver driver) {
		super(driver);
	}
	
	public static String getURL() {
		return url;
	}
	
	

}
