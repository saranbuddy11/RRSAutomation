#Author: Mohanraj

Feature: Generate Step Defs

@run_generated_mar8
 Scenario Outline: Verify user direction to Cart page and validate the details in that page
 	 	
  	Then User assert Upgrade to VIP Plus page displayed
  	And User click on Continue as VIP button in the Page
  

  	Examples:
  	|FirstName|LastName|USAddress|PaymentMethod|
  	|Mohanraj|Murugesan|USAddress1|CreditCard|