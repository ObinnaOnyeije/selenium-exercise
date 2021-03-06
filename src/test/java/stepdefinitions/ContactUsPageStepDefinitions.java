package stepdefinitions;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages.*;

public class ContactUsPageStepDefinitions {
	SingletonBrowserClass instanceOfSingletonBrowserClass;
	WebDriver driver;

	@Before
	public void setup() {
		instanceOfSingletonBrowserClass = SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		driver = instanceOfSingletonBrowserClass.getDriver();
	}
	
	@Given("^user has entered ContactUs page$")
    public void user_has_entered_contactus_page() throws Throwable {
		driver.get(ContactUsPage.getURL());
		assertEquals(ContactUsPage.getURL(), driver.getCurrentUrl());
		Thread.sleep(6000);
    }

    @When("^user enters valid \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_valid_something_something_something_and(String first, String last, String email, String message) throws Throwable {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        ContactFormThankYouPage contactFormThankYouPage = contactUsPage.fillForm(first, last, email, message);
        assertNotNull(contactFormThankYouPage);
    }

    @Then("^user receives confirmation$")
    public void user_receives_confirmation() throws Throwable {
    	assertEquals(ContactFormThankYouPage.getURL(), driver.getCurrentUrl());
    }
    
    @After
    public void clear() {
    	driver.manage().deleteAllCookies();
    }
}
