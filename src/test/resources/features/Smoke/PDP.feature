#Author: Mohanraj S M

@PDP_Full @SmokeSuite_Full
Feature: PDP Smoke Scripts

  @PDP_4.1
 Scenario: Verify user direction to PDP Page
 		Given User Land on the RRS home page
 		And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    #Then User Click on any one of the product from PLP Page
		Then Verify User Navigation to PDP page on clicking of Product
    Then Assert user is directed to appropriate PDP page based on the selection
    And User click on the RRS home page logo
		And User Search for a particular product "40135" and click on search button
    Then Assert user is directed to appropriate PDP page
  
  @PDP_4.2_4.19 
 Scenario: Verify All the required details of the product displayed in PDP page
    Given User Land on the RRS home page
		And User Search for a particular product "40135" and click on search button
    Then Assert user is directed to appropriate PDP page
    Then User Verify MSRP and VIP price of the product is displayed in PDP
    Then User Verify item id of the product is displayed in PDP
    Then User Verify the step 1 your color in PDP - allows user to select one color at one time and image altered
    Then User Verify the step 2  what's your size in PDP - allows user to select one size at one time and image altered
    Then User Verify size chart link is displayed for the user to view the size chart then close the size chart
    Then User Verify application allow to add or decrease the quantity of the product to the max of 10
    Then User Verify product is added to cart only after user selects all the steps
    Then User Verify the description of the product is displayed respective to the product
    Then User Verify the reviews of the product is displayed respective to the product along with options to write a review
    Then User Verify Outfit Your Run section displayed
    Then User Verify You May Also Like section displayed
		#Then User Verify Free in-Store pick up option