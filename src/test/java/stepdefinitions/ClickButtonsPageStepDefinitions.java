package stepdefinitions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages.*;

public class ClickButtonsPageStepDefinitions {

	SingletonBrowserClass instanceOfSingletonBrowserClass;
	WebDriver driver;
	ClickButtonsPage clickButtonsPage;
	List<ModalObject> modals;
	String firstModalText = "";
	String secondModalText = "";
	String thirdModalText = "";
	
	@Before
	public void setup() {
		instanceOfSingletonBrowserClass = SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		driver = instanceOfSingletonBrowserClass.getDriver();
	}
	
	@Given("^user has entered ClickButtons page$")
    public void user_has_entered_clickbuttons_page() throws Throwable {
		driver.get(ClickButtonsPage.getURL());
		assertEquals(ClickButtonsPage.getURL(), driver.getCurrentUrl());
		clickButtonsPage = new ClickButtonsPage(driver);
		assertTrue(clickButtonsPage.getDisplayStatus());
		modals = clickButtonsPage.getAllModals();
		assertNotNull(modals);
		assertEquals(3, modals.size());
    }

    @When("^user clicks first button$")
    public void user_clicks_first_button() throws Throwable {
        clickButtonsPage.clickButton1();
    }

    @When("^user clicks second button$")
    public void user_clicks_second_button() throws Throwable {
    	clickButtonsPage.clickButton2();
    }

    @When("^user clicks third button$")
    public void user_clicks_third_button() throws Throwable {
    	clickButtonsPage.clickButton3();
    }

    @Then("^first alert appears and is handled$")
    public void first_alert_appears_and_is_handled() throws Throwable {
        ModalObject modal = clickButtonsPage.getActiveModal();
        assertNotNull(modal);
        assertEquals(modals.get(0), modal);
        boolean check = clickButtonsPage.closeActiveModal();
        assertTrue(check);
    }

    @Then("^second alert appears and is handled$")
    public void second_alert_appears_and_is_handled() throws Throwable {
    	ModalObject modal = clickButtonsPage.getActiveModal();
        assertNotNull(modal);
        assertEquals(modals.get(1), modal);
        boolean check = clickButtonsPage.closeActiveModal();
        assertTrue(check);
    }

    @Then("^third alert appears and is handled$")
    public void third_alert_appears_and_is_handled() throws Throwable {
    	ModalObject modal = clickButtonsPage.getActiveModal();
        assertNotNull(modal);
        assertEquals(modals.get(2), modal);
        boolean check = clickButtonsPage.closeActiveModal();
        assertTrue(check);
    }
	
	@After
    public void clear() {
    	driver.manage().deleteAllCookies();
    }
}
