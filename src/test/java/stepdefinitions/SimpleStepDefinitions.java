package stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webpages.*;

public class SimpleStepDefinitions {
	SingletonBrowserClass instanceOfSingletonBrowserClass;

    @Given("^test is ready to begin$")
    public void test_is_ready_to_begin() throws Throwable {
//        throw new PendingException();
    }

    @When("^the browser is initialized$")
    public void the_browser_is_initialized() throws Throwable {
//        throw new PendingException();
    	instanceOfSingletonBrowserClass = SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
    }

    @Then("^the browser will be active$")
    public void the_browser_will_be_active() throws Throwable {
//        throw new PendingException();
    	assertNotNull(instanceOfSingletonBrowserClass.getDriver());
    }
    
}
