#Author: R.Karthik
@ATC_Full @RegressionSuite_Full
Feature: ATC Regression Scripts

  @ATC_001
  Scenario: Verify ATC popup is displayed in PDP
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |

  @ATC_002
  Scenario: Verify whether selected product image(Color SKU), product quantity, product name, size, width, MSRP and VIP price are displayed in ATC popup
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Validate ATC Popup

  @ATC_003 
  Scenario: Verify whether the pickup at x city is displayed for Pickup in Store selected products
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |

  @ATC_004 
  Scenario: Verify whether the selected store name is displayed correctly for Pickup in Store selected products
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |

  @ATC_005 
  Scenario: Verify whether X item, subtotal Price $XX.XX displayed beside the Cart Subtotal is correct or not.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Read Quantity and price of product
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And Verify product price and Quantity at ATC popup

  @ATC_006 
  Scenario: Verify whether Cart Subtotal Price is calculated based on total products added in the cart.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Read product price and its quantity
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And Verify Quantity and its price calculation at ATC popup

  @ATC_007 
  Scenario: Verify whether the Your VIP Savings price $XX.XX is displayed with minus (-) symbol in Cart summary Section or not for VIP Users
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then choosing SKU's and Navigate to ATC
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And Verify VIP price in Cart Summary Section
      | cart | VIP Savings | - |

  @ATC_008 
  Scenario: Verify whether the Your VIP Total is displayed along with the calculated amount in Cart summary Section for VIP users
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then choosing SKU's and Navigate to ATC
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And Verify VIP Total and price in Cart Summary Section "cart"

  @ATC_009 
  Scenario: Verify whether the cart subtotal, your VIP savings, your VIP total is calcluated correctly or not.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Read product price and its quantity
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And Verify Quantity and its price calculation at ATC popup
    And Verify VIP Total and price calculation in Cart Summary Section "cart"
    
  @ATC_010 
  Scenario: Verify the application response when the user clicks on View Cart CTA button.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then choosing SKU's and Navigate to ATC
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And Verify View Cart Page "cart"

  @ATC_011 
  Scenario: Verify the application response when the user clicks on Checkout CTA button.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then choosing SKU's and Navigate to ATC to verify Checkout Button
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And Verify Checkout Page "checkout"

  @ATC_012 
  Scenario: Verify whether the You earn $XX.XX VIP Rewards Cash! price is calculated correctly or not for VIP users
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify VIP rewards cash calculation

  @ATC_013 
  Scenario: Verify the ATC toggle for regular, Hoka, outlet, excluded items
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41679" and click on search button
    Then choosing SKU's and Navigate to ATC for brand
      | Heather Black | M | Men's KORSA Accelerate Short Sleeve Tee | 1 |
    And Verify ATC toggle and VIP rewards cash calculation
