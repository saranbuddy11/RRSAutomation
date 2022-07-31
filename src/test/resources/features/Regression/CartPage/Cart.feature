#Author: R.Karthik
@RegressionSuite_Full
Feature: Cart Regression Scripts

  @Regression_RK_001
  Scenario: Verify users direction to Cart page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on View Cart button
    And Verify View Cart Page "cart"

  @Regression_RK_002
  Scenario: Verify the text displayed in 20% banner
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on View Cart button
    And Verify View Cart Page "cart" and banner

  @Regression_RK_003
  Scenario: Verify Join for $1.99 CTA button in 20% banner
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on View Cart button
    And Verify View Cart Page and CTA button for VIP Membership
      | cart | Join for $1.99 |

  @Regression_RK_004
  Scenario: Verfiy My Cart with total number of items in Cart
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page with number of Items "cart"

  @Regression_RK_005
  Scenario: Verify the product image, SKU id, Color, Size, Width, Shipping option/ Pickup at store, Inventory message, MSRP and VIP price in Cart page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and its content "cart"

  @Regression_RK_006
  Scenario: Verify Product name and Click functionality
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and product name with its functionality "cart"

  @Regression_RK_007
  Scenario: Verify the Option to increase and decrease quantity
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Quantity option "cart"

  @Regression_RK_008
  Scenario: Verify Join VIP and Get this Price link and its Functionality
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Join VIP Link "cart"

  @Regression_RK_009
  Scenario: Verify Remove text and its Functionality
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Remove Functionality "cart" "Your shopping cart is empty"

  @Regression_RK_010
  Scenario: Verify Order Subtotal under Order Summary section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Order Subtotal "cart"

  @Regression_RK_011
  Scenario: Verify the Checkout button response
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Checkout button response
      | cart | checkout |

  @Regression_RK_012
  Scenario: Verify Login and Checkout button response
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Login and Checkout button response
      | cart | Login & Checkout | MY ACCOUNT |
