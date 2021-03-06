@test @contactuspage
Feature: Testing of WebDriverUniversity Contact Us page

Scenario Outline: Test of Contact Us Form
	Given user has entered ContactUs page
	When user enters valid "<first>" "<last>" "<email>" and "<message>"
	Then user receives confirmation
	
	Examples:
		|first|last|email|message|
		|one|dude|email@mail.com|message|
		|second|man|mail@email.com|message|