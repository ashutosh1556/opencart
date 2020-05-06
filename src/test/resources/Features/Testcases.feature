67832w@opencart
Feature: Opencart website 
This is to validate the opencart website

Scenario: to validate the register functionality
	Given launch the Browser  and enter the url 
	When url is enterd 
	Then click on myaccount and register
	Then enter <userfname>
	Then enter <userlname>
	Then enter <useremail>
	Then enter <telenumber>
	Then enter <pass>
	Then enter <confirm>
	Then complete the registration

Scenario: To validate login functionatlity
	Given Launch the browser and enter url
	Then navigate to login page
	Then enter <email>
	Then enter <password>
	Then click on login button
			
Scenario Outline: To validate Searching  product and reviewing 
	Given launch browser and enter the url
	Then enter the product in "<srchbar>"
	Then select the product and review it
	
Examples: 
|srchbar|	
|mac	|
|mac    |	

Scenario: To validate the password change functionality
	Given Launch the Browser and enter the opencart url
	Then after login navigate to my accounts
	Then change the password