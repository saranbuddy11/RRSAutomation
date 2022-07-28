#Author: Mohanraj
@test_full_feb28
Feature: POC script for RRS

  @PLP_3.1
  Scenario: Verify user direction to PLP Page
    Given User Land on the RRS home page
    #And User Click on shop now link in any of the home page banner
    #Then Assert user is direceted to appropriate PLP page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used

  @PLP_3.3 @PLP_3.9 @PLP_3.10
  Scenario: Verify the page results by applying on any of the filters and validate Review Stars & Color variants
    Given User click on the RRS home page logo
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And User store the number of search results to a variable
    And User apply the filter "Shoes" in the PLP page
    Then User validate the page results based on the filter applied
    Then User validate review stars for the product are displayed if available
    Then User validate color variations for the product are displayed if available
