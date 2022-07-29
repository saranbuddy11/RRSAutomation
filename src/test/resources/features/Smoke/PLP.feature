#Author: Mohanraj
@PLP_Full @SmokeSuite_Full
Feature: PLP Smoke Scripts

  @PLP_3.1
  Scenario: Verify user direction to PLP Page
    Given User Land on the RRS home page
    And User Click on shop now link in any of the home page banner
    Then Assert user is direceted to appropriate PLP page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used

  @PLP_3.2
  Scenario: Verify the page results by clicking on any of the options under "Sort By"
    Given User Land on the RRS home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And User store the number of search results to a variable
    And User select "Price: Low to High" Sort by value from the dropdown
    Then User validate the results count not modified but the sorting is modified

  @PLP_3.3 @PLP_3.9 @PLP_3.10 @PLP_3.11 @PLP_3.13
  Scenario: Verify the page results by applying on any of the filters and validate other test cases of PLP
    Given User Land on the RRS home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And User store the number of search results to a variable
    And User apply the filter "Shoes" in the PLP page
    Then User validate the page results based on the filter applied
    #Then User validate review stars for the product are displayed if available
    Then User validate color variations for the product are displayed if available
    And User scroll down to load 48 products to display pagination link
    And User go back to the top of the page
    #And User clear the applied filters
    #Then User validate the serach results are modified once the filters are cleared
