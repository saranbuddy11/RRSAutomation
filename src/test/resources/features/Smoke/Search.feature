#Author: Sairam
@Search_RRS @SmokeSuite_Full
Feature: Search smoke scripts

  @search_1.0 @SmokeSuite
  Scenario Outline: Verify search with a brand name
    Given User Land on the RRS home page
    And User clicks on search text box
    And User Search with a Brand name "Adidas"
    And User click on Search button
    Then User lands on Brand "Adidas" page
    
    
    @search_2.0 @SmokeSuite
  Scenario Outline: Verify user lands on SLP page
    Given User Land on the RRS home page
    And User clicks on search text box
    And User Search with some keyword "WOMEN ASICS" 
    And User click on Search button
    And User clicks on Shoes filter section 
    And User clicks on Hide filter
    And User click on Sort by
    And User selects Top Rated 
    

    
 @search_3.0 @SmokeSuite
  Scenario Outline: Verify search with a Product name
    Given User Land on the RRS home page
    And User clicks on search text box
    And User Search for a particular product "39790" and click on search button
    Then Assert user is directed to appropriate PDP page
    