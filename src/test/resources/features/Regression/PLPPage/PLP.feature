#Author:
@PLP_Full @RegressionSuite_Full
Feature: PLP Regression Scripts

  @PLP_001
  Scenario: Verify user direction to PLP Page
    Given User Land on the RRS home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used

  @PLP_002
  Scenario: Verify the page results by clicking on any of the options under "Sort By"
    Given User Land on the RRS home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And User store the number of search results to a variable
    And User select "Price: Low to High" Sort by value from the dropdown
    Then User validate the results count not modified but the sorting is modified

  @PLP_003
  Scenario: Verify applying filter in PLP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And User applies filter on main category and categories
      | Shoes | Casual |
    Then User validate the results page appropriate to the appplied filter or not
      | Casual | WOMEN ASICS |

  @PLP_004
  Scenario: Verify pagination in PLP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And User should be able to see 48 products in the PLP page with page numbers, next and prev arrow icons

  @PLP_005
  Scenario: Verify Bread Crumb response in PLP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And User applies filter on main category and categories
      | Shoes | Casual |
    And Clicking on any of the home page category
      | kids | Running |
    Then User should be directed to PLP with the category bread crumb displayed in PLP page
      | Home | Boys | Shoes | Running |

  @PLP_006
  Scenario: Verify Clear filters and Hide filters response
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And User applies filter on main category and categories
      | Shoes | Casual |
    And Verify filters and its functionality
      | Shoes | Casual | ASCIS | WOMEN |

  @PLP_007
  Scenario: Verify Brands click response in LHN Filters
    Given User Lauch RRS application and navigate to home page
    And Select a category from the top navigation menu "womens"
    Then User should be able to see search bar with Magnifying icon to search brand in the filters present in LHN
    And User should be able to see the default 8 Brands in the Brand section filter
    And Verify the Links in Brand section and its functionality 8

  @PLP_008
  Scenario: Verify Reviews star and count in PLP
    Given User Lauch RRS application and navigate to home page
    And Select a category from the top navigation menu "womens"
    Then User should be able to see the Reviews count along with the star rating

  @PLP_009
  Scenario: Verify Pricing displayed in PLP
    Given User Lauch RRS application and navigate to home page
    And Select a category from the top navigation menu "womens"
    Then User should be able to see the Prices for the product
      | SALE | $ |
