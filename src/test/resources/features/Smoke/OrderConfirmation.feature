#Author: Mohanraj

@OC_Full @SmokeSuite_Full
Feature: Order Confirmation Page Smoke scripts

  @OC_ExistingVIPFlow
 Scenario Outline: Verify the flow of order confirmation in Existing VIP user
	  Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the credentials of the user <User>
		And User click on Login button
		#Then user validate the successful login
		#And User click on the RRS home page logo
		And User Search for a particular product "40135" and click on search button
    Then Assert user is directed to appropriate PDP page
 	  And User Select the color variant "Pale Grey"
    And User Select the size as "XL"
  	And User note down MSPR and VIP price of the product displayed
  	And User click on Add to Cart button
  	Then Assert Add to Cart popup got displayed
  	And User Click on View Cart button
  	Then User Assert Cart Page is displayed
  	And User Click on Checkout button as VIP
  	Then User assert Upgrade to VIP Plus page displayed
  	And User click on Continue as VIP button in the Page
		Then Assert user is directed to Checkout Step 3 page since logged in user is Existing VIP user
		And User enter the CVV for the exiting Card
		And User click on Place Order button
		Then Assert Order Number generated successfully
  	Then Assert Thank You message displayed with FirstName <FirstName>
  	Then Assert Wow VIP savings banner details in the OC page
  	Then Assert Upgrade to VIP Plus details is displayed
  	
		Examples: 
      |User|FirstName|
      |VIP2|TEST|