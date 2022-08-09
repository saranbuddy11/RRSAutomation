#Author: R.Karthik
@RegressionSuite_Full
Feature: Order Confirmation Regression Scripts

  @Regression_RK_001
  Scenario: Verify whether the user able to place an order or not.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Shipping section fields
      | abcd | efgh | xyz, 234 poickd | qwerty | phoenix | 85054 | abc123@gmail.com | 9234567810 | AZ - Arizona | United States |
    And Click Place Order Button and validate Error message
      | Please fill in these required fields: Card Number Card Holder Name Expiration Month Expiration Year CVN |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |

  @Regression_RK_002
  Scenario: Verify the header, footer are displayed and RRS Logo functionality in Order confirmation page.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Shipping section fields
      | abcd | efgh | xyz, 234 poickd | qwerty | phoenix | 85054 | abc123@gmail.com | 9234567810 | AZ - Arizona | United States |
    And Click Place Order Button and validate Error message
      | Please fill in these required fields: Card Number Card Holder Name Expiration Month Expiration Year CVN |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify Header and Footer
    And Verify RRS Logo functionality
