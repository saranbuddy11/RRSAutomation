#Author: Mohanraj
@ATCPOPUP_Full @SmokeSuite_Full
Feature: Add to Cart Pop UP Smoke scripts

  @ATCPOPUP_9.1
 Scenario: Verify details present in Add to Cart Pop Up
 		Given User Land on the RRS home page
		And User Search for a particular product "41716" and click on search button
    Then Assert user is directed to appropriate PDP page
    And User Select the color variant "White"
  	And User Select the size as "XL"
  	And User note down MSPR and VIP price of the product displayed
  	And User click on Add to Cart button
  	Then Assert Add to Cart popup got displayed
  	Then User valdiate Add to Cart Popup displayed correct MSRP VIP price
  	Then User validate selected Color size dispalyed in the Add to cart pop up