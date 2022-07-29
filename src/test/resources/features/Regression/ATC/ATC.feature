#Author: R.Karthik
@RegressionSuite_Full
Feature: ATC Regression Scripts

  @Regression_RK_001
  Scenario: Verify ATC popup is displayed in PDP
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |

  @Regression_RK_002
  Scenario: Verify whether selected product image(Color SKU), product quantity, product name, size, width, MSRP and VIP price are displayed in ATC popup
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Validate ATC Popup

  @Regression_RK_003 @city
  Scenario: Verify whether the pickup at x city is displayed for Pickup in Store selected products
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |

  @Regression_RK_004 @city
  Scenario: Verify whether the selected store name is displayed correctly for Pickup in Store selected products
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |
