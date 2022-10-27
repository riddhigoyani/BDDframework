 Feature: Free CRM Login Feature

#Simple Data Driven Approach without Example keyword
#Scenario: Free CRM Login Test Scenario

#Given user is on main Page
#When title of page is Free CRM
#Then user clicks on login
#Then user enters sp4tel12@gmail.com and Abcd@1234
#And user clicks on login button
#Then user is on home page

#With Eaxmple Keyword
Scenario Outline: Free CRM Login Test Scenario		#When we use With Example we have to put Scenario Outline

Given user is on main Page
When title of page is Free CRM
Then user clicks on login
Then user enters "<username>" and "<password>"
And user clicks on login button
Then user is on home page
And close the browser

Examples:
	| 	username		|	password	|
	|sp4tel12@gmail.com	|	Abcd@1234	|
	|		tom			|	XYZ@123		|
	
	
#Scenario: user is able to create a new contat

#Given user is already on home page
#When user mouse over on contacts link
#Then user clicks on New Contact link
#Then user enters firstname and lastname
#Then user clicks on save button
#Then verify new contact created







 