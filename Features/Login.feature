Feature: Login 

Scenario: Sucessfull login with valid scenerios
	Given User launch Chrome brouser 
	When open URL "http://rqa.wyndhamhotels.com/" 
	And User Click on Sign in button 
	And User enter Username and Password and click on Signin button 
	Then User enter Answer to Security question and click on submit button 
	Then Title of the landing page should be "Wyndham Hotels & Resorts | Search for Hotel Room Rates, Deals, and Getaways"
	And Close the browser
	
Scenario: Sucessfull login with valid scenerios and change My Profile
	Given User launch Chrome brouser 
	When open URL "http://rqa.wyndhamhotels.com/" 
	And User Click on Sign in button 
	And User enter Username and Password and click on Signin button 
	Then User enter Answer to Security question and click on submit button 
	Then Title of the landing page should be "Wyndham Hotels & Resorts | Search for Hotel Room Rates, Deals, and Getaways" 
	And click on my account
	Then Change Primary Phone Number and Phone Type
	And Also change Birthday 
	
