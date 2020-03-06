@test @homepage
Feature: Testing of WebDriverUniversity home page

Scenario: Test of link to ContactUs page
	Given user is on homepage
	When user clicks ContactUs link
	Then user is on ContactUs page