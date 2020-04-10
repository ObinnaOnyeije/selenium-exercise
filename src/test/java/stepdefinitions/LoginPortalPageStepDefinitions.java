package stepdefinitions;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import webpages.*;

public class LoginPortalPageStepDefinitions {
	
	SingletonBrowserClass instanceOfSingletonBrowserClass;
	WebDriver driver;
	LoginPortalPage loginPortalPage;
	LoginPortalSuccessPage successPage;
	LoginPortalFailurePage failurePage;
	
	@Before
	public void setup() {
		instanceOfSingletonBrowserClass = SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		driver = instanceOfSingletonBrowserClass.getDriver();
	}

	@Given("^user has entered LoginPortal page$")
    public void user_has_entered_loginportal_page() throws Throwable {
		driver.get(LoginPortalPage.getURL());
		assertEquals(LoginPortalPage.getURL(), driver.getCurrentUrl());
		loginPortalPage = new LoginPortalPage(driver);
		assertTrue(loginPortalPage.getDisplayStatus());
    }

    @When("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_valid_something_and_something(String username, String password) throws Throwable {
        successPage = loginPortalPage.enterValidCredentials(username, password);
        assertNotNull(successPage);
    }

    @When("^user enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_invalid_something_and_something(String username, String password) throws Throwable {
    	loginPortalPage = new LoginPortalPage(driver);
        failurePage = loginPortalPage.enterInvalidCredentials(username, password);
        assertNotNull(failurePage);
    }

    @Then("^user is taken to success confirmation$")
    public void user_is_taken_to_success_confirmation() throws Throwable {
    	assertEquals(LoginPortalSuccessPage.getURL(), driver.getCurrentUrl());
    	assertTrue(successPage.getDisplayStatus());
    }

    @Then("^user is taken to failure confirmation$")
    public void user_is_taken_to_failure_confirmation() throws Throwable {
    	assertEquals(LoginPortalFailurePage.getURL(), driver.getCurrentUrl());
    	assertTrue(failurePage.getDisplayStatus());
    }
    
    @After
    public void clear() {
    	driver.manage().deleteAllCookies();
    }
    
}
