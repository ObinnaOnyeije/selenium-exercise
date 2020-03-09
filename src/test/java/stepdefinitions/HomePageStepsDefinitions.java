package stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages.*;

public class HomePageStepsDefinitions {
	SingletonBrowserClass instanceOfSingletonBrowserClass;
	WebDriver driver;
	ContactUsPage contactUsPage;
	
	@Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
		instanceOfSingletonBrowserClass = SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		driver = new ChromeDriver();
		driver.get(HomePage.getURL());
		assertEquals(HomePage.getURL(), driver.getCurrentUrl());
		Thread.sleep(6000);
    }

    @When("^user clicks ContactUs link$")
    public void user_clicks_contactus_link() throws Throwable {
        HomePage homePage = new HomePage(driver);
        contactUsPage = homePage.clickContactUsLink();
//        try {
//        	contactUsPage = homePage.clickContactUsLink();
//        } catch (Exception e) {
//        	e.printStackTrace();
//        }
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
        
    }

    @Then("^user is on ContactUs page$")
    public void user_is_on_contactus_page() throws Throwable {
    	Thread.sleep(6000);
    	assertEquals(ContactUsPage.getURL(), driver.getCurrentUrl());
    	driver.quit();
    }
}
