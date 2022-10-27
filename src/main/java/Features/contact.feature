 Feature: Free CRM create new contact Feature


 Scenario Outline: Free CRM contact Test Scenario		
 
 
Given user is on main Page
When title of page is Free CRM
Then user clicks on login
Then user enters "<username>" and "<password>"
And user clicks on login button
Then user is on home page
Then user creates new contact
Then user enters contact "<firstname>" and "<lastname>" and "<position>"
Then user clicks on save button
Then go back to contacts
Then user delete previos contacts
And close the browser

Examples:
	| 	username		|	password	| 	firstname	|	lastname	|	position	|
	|sp4tel12@gmail.com	|	Abcd@1234	|	Tom			|	Peter		|	Manager		|
	|sp4tel12@gmail.com	|	Abcd@1234	|	Shivam		|	Patel		|	Worker		|