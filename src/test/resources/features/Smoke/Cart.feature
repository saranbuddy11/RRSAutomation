#Author: Mohanraj
@Cart_Full @SmokeSuite_Full
Feature: Add to Cart Pop UP Smoke scripts

  @CART_5.1_5.8
 Scenario: Verify user direction to Cart page and validate the details in that page
 	  Given User Land on the RRS home page
		And User Search for a particular product "40135" and click on search button
    Then Assert user is direceted to appropriate PDP page
 	  And User Select the color variant "Pale Grey"
    And User Slect the size as "L"
  	And User note down MSPR and VIP price of the product displayed
  	And User click on Add to Cart button
  	Then Assert Add to Cart popup got displayed
  	And User Click on View Cart button
  	Then User Assert Cart Page is displayed
  	Then User validate Order Summary section has option to increase or decrease the quantity of the product
  	Then User valdiate Checkout option is displayed in the Cart page
  	Then User validate option to become VIP is displayed in the Cart page
  	Then User validate Paypal payment option is displayed in the Cart page
  	And User Click on I have source code link and enter valid source code "TEST"
  	Then User validate the offer applied to the Cart
  	Then User validate Top Picks For You section with recommanded or Personalized products is diaplayed in the Cart page
 	  And User click on the RRS home page logo
 	  And User click on Cart icon in the home page
 	  Then User Assert Cart Page is displayed
 	  And User note down the total VIP savings amount for the cart
 	  And User click on Join for 1.99 button
 	  Then User validate VIP Family popup displayed with VIP savings
 	  And User Click on View Cart button in the VIP family popup
 	  Then User valdiate Total amount to be paid is modified with promotion applied
 	  And User validate the Estimated total amount dispalyed is same as the VIP benefits listed previously
 	  Then User validate the product is displayed with VIP Price