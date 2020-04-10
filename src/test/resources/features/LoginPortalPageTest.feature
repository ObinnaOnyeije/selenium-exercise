@test @loginportalpage
Feature: Testing of WebDriverUniversity Login Portal page

Scenario Outline: Test of Login Form with Correct Credentials
	Given user has entered LoginPortal page
	When user enters valid "<username>" and "<password>"
	Then user is taken to success confirmation
	
	Examples:
		|username|password|
		|webdriver|webdriver123|
		|webdriver2|webdriver321|
		
Scenario Outline: Test of Login Form with Incorrect Credentials
	Given user has entered LoginPortal page
	When user enters invalid "<username>" and "<password>"
	Then user is taken to failure confirmation
	
	Examples:
		|username|password|
		|webdriver2|webdriver123|
		|webdriver|webdriver321|
		|success|failure|