#Author: R.Karthik
@OC_Full @RegressionSuite_Full
Feature: Order Confirmation Regression Scripts

  @OC_001
  Scenario: Verify whether the user able to place an order or not.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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

  @OC_002 
  Scenario: Verify the header, footer are displayed and RRS Logo functionality in Order confirmation page.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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

  @OC_003
  Scenario: Verify whether the order number is displayed at the top along with “Thank You, Firstname!“ and  “Your order is confirmed. We will send you email updates on the status of your order.“ text below it.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
    And Verify Order Confirmation Page content
      | order-confirmation | Thank YOU abcd! | Order # | Your order is confirmed. We'll send you email updates on the status of your order. |

  @OC_004
  Scenario: Verify whether the Join VIP bubble blue banner is displayed with price calculation and Upgrade my order CTA
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      # | please fill in all the required fields |
      | Please fill in these required fields: Card Number Card Holder Name Expiration Month Expiration Year CVN |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify VIP bubble blue banner
      | IT'S NOT TOO LATE TO GET | IN VIP BENEFITS ON THIS ORDER! |

  @OC_005
  Scenario: Verify the application response when the user clicks on the Upgrade my order button in the VIP benefits modal popup for guest.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      # | please fill in all the required fields |
      | Please fill in these required fields: Card Number Card Holder Name Expiration Month Expiration Year CVN |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify upgrade my order
      | CONGRATULATIONS | ON BEING OUR NEWEST VIP MEMBER |

  @OC_006 
  Scenario: Verify whether the Checkout faster next time section is displayed for Guest User
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      # | please fill in all the required fields |
      | Please fill in these required fields: Card Number Card Holder Name Expiration Month Expiration Year CVN |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify Checkout Faster section
      | Check out faster next time | Create Account |

  @OC_007 
  Scenario: Verify whether the email address of the user is auto populated and editable in the Checkout Faster Next Time section.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      # | please fill in all the required fields |
      | please fill in these required fields: credit card: card number card holder name card expiration month card expiration year card cvn |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify Email Address in Checkout Faster section
      | abc123@gmail.com | value | xyz@gmail.com |

  @OC_008
  Scenario: Verify the application response when the user enters email address, password, confirm password and click on the Create Account CTA button.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      | please fill in all the required fields |
    # | please fill in these required fields: credit card: card number card holder name card expiration month card expiration year card cvn |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify Create Account Button
      | 123456 | Your account has been created successfully! GO TO YOUR ACCOUNT |

  @OC_009
  Scenario: Verify the fields in the shipping address, contact info and payment info of order details section.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      #| please fill in all the required fields |
      | please fill in these required fields: credit card: card number card holder name card expiration month card expiration year card cvn |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify Shipping address field
      | abcd | efgh | xyz, 234 poickd | qwerty | phoenix | 85054 | AZ | United States | NON-VIP Standard Shipping | Guaranteed Delivery by |
    And Verify Contact Info
      | abc123@gmail.com | 9234567810 |
    And Verify Payment Info
      | Visa | ending in 1111 |

  @OC_010 
  Scenario: Verify the fields in the order summary section.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      #| please fill in all the required fields |
      | please fill in these required fields: credit card: card number card holder name card expiration month card expiration year card cvn |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify Order Summary field
      | Order Summary | Order Total |

  @OC_011
  Scenario: Verify whether the Cart - Option is displayed in the OC page with the expand and collapse click
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      #| please fill in all the required fields |
      | please fill in these required fields: credit card: card number card holder name card expiration month card expiration year card cvn |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify Cart Option
      | Cart | Shipping | IN STOCK! Arrives from Road Runner Sports in 1-3 business days. |

  @OC_012
  Scenario: Verify the items displayed in the shipping section.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
     | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      #| please fill in all the required fields |
      | please fill in these required fields: credit card: card number card holder name card expiration month card expiration year card cvn |
    And Enter Credit Card details
      | 4111111111111111 | Test | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify Item in Shipping Section
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short | Quantity 1 |

  @OC_013
  Scenario: Verify the items displayed in the Pickup at Store_Name section.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
       | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Scottsdale |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Shipping section fields
      | Test | Account | xyz, 234 poickd | qwerty | phoenix | 85054 | abc123@gmail.com | 9234567810 | AZ - Arizona | United States |
    And Click Place Order Button and validate Error message
      #| please fill in all the required fields |
      | please fill in these required fields: credit card: card number card holder name card expiration month card expiration year card cvn |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU Test! |
    And Verify Pickup at Store_Name in Shipping Section
      | Pickup at Scottsdale |

  @OC_014
  Scenario: Verify Order Confirmation page Math Calculation banner for Guest User/ Logged-in Non-VIP User
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
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
      # | please fill in all the required fields |
      | please fill in these required fields: credit card: card number card holder name card expiration month card expiration year card cvn |
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |
    And Verify VIP bubble blue banner
      | IT'S NOT TOO LATE TO GET | IN VIP BENEFITS ON THIS ORDER! |
    And Verify Math Calculation banner
      | 20% VIP Benefits Today, Then 10% Every Day | 10% VIP Rewards Cash Earned | VIP Fast, Free Shipping Value | $0.00 | $9.00 | $7.00 |

  @OC_015 
  Scenario: Verify Order Confirmation page Math Calculation banner for VIP user.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | B | 6 | aria-label | Black/Blue/Purple | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Login with VIP user credentials
      | testcucumbervip@gmail.com | 123456 |
    And Click on place order CTA button
      | 123 |
    And Verify Math Calculation on Banner
      | REMEMBER ALL YOUR AWESOME VIP BENEFITS! | Thank YOU test! | $7.00 | 10% VIP Savings | 10% VIP Rewards Cash Earned | VIP Shipping Value |
    Then User logout of the application

  @OC_016
  Scenario: Verify Order Confirmation page Math Calculation banner for VIP Plus User
    Given User Land on the RRS home page after login with VIP user
      | testcucumbervipplus@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | B | 6 | aria-label | Black/Blue/Purple | 1 | 2 |
    And User Click on Checkout Button
      | checkout |
    And Click on place order CTA button
      | 123 |
    And Verify Math Calculation on Banner
      | REMEMBER ALL YOUR AWESOME VIP BENEFITS! | Thank YOU VIPPlus! | $7.00 | 10% VIP Savings | 10% VIP Rewards Cash Earned | VIP Shipping Value |
    Then User logout of the application
