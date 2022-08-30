#Author: Mohanraj S M

@CHECKOUT_Full @SmokeSuite_Full
Feature: Checkout Page Smoke scripts

  @OC_GuestuserFlow
 Scenario Outline: Verify user Direction to Checkout and Checkout as Guest user
  	Given User Land on the RRS home page
		And User Search for a particular product "41716" and click on search button
    Then Assert user is directed to appropriate PDP page
 	  And User Select the color variant "White"
    And User Select the size as "XL"
  	And User note down MSPR and VIP price of the product displayed
  	And User click on Add to Cart button
  	Then Assert Add to Cart popup got displayed
  	And User Click on View Cart button
  	Then User Assert Cart Page is displayed
  	And User Click on Checkout button
  	Then Assert Step 1 page of Check out displayed
  	Then Assert Continue as Guest option is displayed
  	Then Assert Login with Online Account option is displayed
  	Then Assert Login with Online Account option has all the required fields
  	Then Assert Attach My VIP Membership option is displayed
  	And User click on Continue as Guest button
  	Then Assert Checkout Do the Math(Memberhsip) page is displayed
  	And User click on Continue without VIP CTA button
  	Then Assert Step 3 Checkout page got displayed
  	Then Assert the Order Summary details in the Checkout page
  	And User select differnt shipping method in the Checkout page
  	Then Assert Order summary is updated with the new shipping fees
  	And User expand and enter valid source code "TEST"
  	Then Assert the promotion applied to the order summary
  	And User scroll down to Payment section in Check Out page
  	Then Assert Giftcard Payment option is displayed
  	Then Assert Credit Card Payment option is displayed
  	Then Assert PayPal Payment option is displayed
  	Then Assert Join VIP banner is displayed with price calculation
  	And User enter valid First Name <FirstName> and Last Name <LastName>
  	And User enter valid US shipping address <USAddress>	
  	And User enter random Email ID in checkout page
  	And User enter random Mobile number in checkout page
  	And User use Credit Card Payment Method <PaymentMethod> in the checkout page
  	And User click on Place Order button
  	Then Assert Order Number generated successfully
  	Then Assert Thank You message displayed with FirstName <FirstName>
  	Then Assert Order Details sections is displayed in OC Page
  	Then Assert Order Confirmation page Title

  	Examples:
  	|FirstName|LastName|USAddress|PaymentMethod|
  	|Lavanya|Balu|USAddress1|CC1|