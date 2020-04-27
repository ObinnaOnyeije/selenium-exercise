@test @clickbuttonspage
Feature: Testing of WebDriverUniversity Buttons Page

Scenario: Test of First Button via WebElement Click
	Given user has entered ClickButtons page
	When user clicks first button
	Then first alert appears and is handled
	
Scenario: Test of Second Button via JavascriptExecutor Click
	Given user has entered ClickButtons page
	When user clicks second button
	Then second alert appears and is handled
	
Scenario: Test of Third Button via Actions Click
	Given user has entered ClickButtons page
	When user clicks third button
	Then third alert appears and is handled