package stepdefinitions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages.*;

public class HomePageStepsDefinitions {
	SingletonBrowserClass instanceOfSingletonBrowserClass;
	WebDriver driver;
	
	@Given("^user begins on homepage$")
    public void user_begins_on_homepage() throws Throwable {
		instanceOfSingletonBrowserClass = SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		driver = instanceOfSingletonBrowserClass.getDriver();
		driver.get(HomePage.getURL());
		assertEquals(HomePage.getURL(), driver.getCurrentUrl());
		Thread.sleep(6000);
    }

    @When("^user clicks ContactUs link$")
    public void user_clicks_contactus_link() throws Throwable {
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = homePage.clickContactUsLink();
        assertNotNull(contactUsPage);
    }
    
    @When("^user clicks LoginPortal link$")
    public void user_clicks_loginportal_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
        LoginPortalPage loginPortalPage = homePage.clickLoginPortalLink();
        assertNotNull(loginPortalPage);
    }

    @When("^user clicks ClickButtons link$")
    public void user_clicks_clickbuttons_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
        ClickButtonsPage clickButtonsPage = homePage.clickClickButtonsLink();
        assertNotNull(clickButtonsPage);
    }

    @When("^user clicks ToDoList link$")
    public void user_clicks_todolist_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	ToDoListPage toDoListPage = homePage.clickToDoListLink();
        assertNotNull(toDoListPage);
    }

    @When("^user clicks PageObjectModel link$")
    public void user_clicks_pageobjectmodel_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	PageObjectModelPage pageObjectModelPage = homePage.clickPageObjectModelLink();
        assertNotNull(pageObjectModelPage);
    }

    @When("^user clicks Accordion link$")
    public void user_clicks_accordion_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	AccordionPage accordionPage = homePage.clickAccordionLink();
        assertNotNull(accordionPage);
    }

    @When("^user clicks DropdownCheckboxesRadioButtons link$")
    public void user_clicks_dropdowncheckboxesradiobuttons_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	DropdownCheckboxesRadioButtonsPage dropdownCheckboxesRadioButtonsPage = homePage.clickDropdownCheckboxesRadioButtonsLink();
        assertNotNull(dropdownCheckboxesRadioButtonsPage);
    }

    @When("^user clicks AjaxLoader link$")
    public void user_clicks_ajaxloader_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	AjaxLoaderPage ajaxLoaderPage = homePage.clickAjaxLoaderLink();
        assertNotNull(ajaxLoaderPage);
    }

    @When("^user clicks Actions link$")
    public void user_clicks_actions_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	ActionsPage actionsPage = homePage.clickActionsLink();
        assertNotNull(actionsPage);
    }

    @When("^user clicks Scrolling link$")
    public void user_clicks_scrolling_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	ScrollingPage scrollingPage = homePage.clickScrollingLink();
        assertNotNull(scrollingPage);
    }

    @When("^user clicks PopupAlerts link$")
    public void user_clicks_popupalerts_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	PopupAlertsPage popupAlertsPage = homePage.clickPopupAlertsLink();
        assertNotNull(popupAlertsPage);
    }

    @When("^user clicks IFrame link$")
    public void user_clicks_iframe_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	IFramePage iFramePage = homePage.clickIFrameLink();
        assertNotNull(iFramePage);
    }

    @When("^user clicks HiddenElements link$")
    public void user_clicks_hiddenelements_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	HiddenElementsPage hiddenElementsPage = homePage.clickHiddenElementsLink();
        assertNotNull(hiddenElementsPage);
    }

    @When("^user clicks DataTable link$")
    public void user_clicks_datatable_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	DataTablePage dataTablePage = homePage.clickDataTableLink();
        assertNotNull(dataTablePage);
    }

    @When("^user clicks AutocompleteTextField link$")
    public void user_clicks_autocompletetextfield_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	AutocompleteTextFieldPage autocompleteTextFieldPage = homePage.clickAutocompleteTextFieldLink();
        assertNotNull(autocompleteTextFieldPage);
    }

    @When("^user clicks FileUpload link$")
    public void user_clicks_fileupload_link() throws Throwable {
    	HomePage homePage = new HomePage(driver);
    	FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
        assertNotNull(fileUploadPage);
    }

    @Then("^user is on ContactUs page$")
    public void user_is_on_contactus_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(ContactUsPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }
    
    @Then("^user is on LoginPortal page$")
    public void user_is_on_loginportal_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(LoginPortalPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on ClickButtons page$")
    public void user_is_on_clickbuttons_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(ClickButtonsPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on ToDoList page$")
    public void user_is_on_todolist_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(ToDoListPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on PageObjectModel page$")
    public void user_is_on_pageobjectmodel_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(PageObjectModelPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on Accordion page$")
    public void user_is_on_accordion_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(AccordionPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on DropdownCheckboxesRadioButtons page$")
    public void user_is_on_dropdowncheckboxesradiobuttons_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(DropdownCheckboxesRadioButtonsPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on AjaxLoader page$")
    public void user_is_on_ajaxloader_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(AjaxLoaderPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on Actions page$")
    public void user_is_on_actions_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(ActionsPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on Scrolling page$")
    public void user_is_on_scrolling_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(ScrollingPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on PopupAlerts page$")
    public void user_is_on_popupalerts_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(PopupAlertsPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on IFrame page$")
    public void user_is_on_iframe_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(IFramePage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on HiddenElements page$")
    public void user_is_on_hiddenelements_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(HiddenElementsPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on DataTable page$")
    public void user_is_on_datatable_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(DataTablePage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on AutocompleteTextField page$")
    public void user_is_on_autocompletetextfield_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(AutocompleteTextFieldPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }

    @Then("^user is on FileUpload page$")
    public void user_is_on_fileupload_page() throws Throwable {
    	String oldWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        assertEquals(2, allWindows.size());
        for (String window : allWindows) {
            if (!window.equals(oldWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    	assertEquals(FileUploadPage.getURL(), driver.getCurrentUrl());
    	driver.close();
    	driver.switchTo().window(oldWindow);
    }
}
