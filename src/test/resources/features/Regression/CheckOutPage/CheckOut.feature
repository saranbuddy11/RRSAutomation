#Author: R.Karthik
@Checkout_Full @RegressionSuite_Full
Feature: Checkout Regression Scripts

  @Checkout_001
  Scenario: Verify whether the user is able to navigates to the start checkout page or not.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |

  @Checkout_002
  Scenario: Verify whether header is displayed in checkout page or not
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Header menus displayed or not

  @Checkout_003
  Scenario: Verify the functionality of RRS Logo.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify the functionality of RRS Logo

  @Checkout_004
  Scenario: Verify the application response when the user clicks on Edit Cart CTA Button.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify the application response when the user clicks on Edit Cart CTA Button "cart"

  @Checkout_005
  Scenario: Verify whether the 3 different way of checkout is displayed in the start checkout Page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify different way of checkout is displayed or not
      | Continue as Guest | Log In | Attach my VIP Membership | LOGIN WITH ONLINE ACCOUNT |

  @Checkout_006
  Scenario: Verify the application response when the user clicks on continue as guest CTA Button.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Continue as Guest and its navigation
      | Continue as Guest | SAVE 20% TODAY |

  @Checkout_007
  Scenario: Verify whether the Login with online account section has respective fields or not.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify login with online account section and its fields
      | LOGIN WITH ONLINE ACCOUNT | Log In | Forgot my password |

  @Checkout_008
  Scenario: Verify the application response when the user enters valid email in the Email Address field and incorrect password in the password field and clicks on Login CTA Button.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Error Message for Wrong Password
      | testcucumbervip@gmail.com | 1233444566677 | This combination of user name and password is invalid. |

  @Checkout_009
  Scenario: Verify the application response when the user enters valid email in the Email Address field and valid password in the password field and clicks on Login CTA Button.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Valid credentials Login
      | testcucumbervip@gmail.com | 123456 | UPGRADE AND CHECKOUT | CONTINUE AS A VIP |
    Then User logout of the application

  @Checkout_010
  Scenario: Verify whether the Logged in NONVIP user is able to navigates to the Checkout Membership page or not.
    Given User Land on the RRS home page after login with user
      | testcucumber@yopmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Checkout Page
      | SAVE 20% TODAY |
    Then User logout of the application

  @Checkout_011
  Scenario: Verify whether the Logged in VIP user with VIP Plus in cart/Logged in VIP plus user is able to navigates to the Checkout Membership page or not.
    Given User Land on the RRS home page after login with user
      | testcucumbervip@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Checkout Page
      | JOIN THE MOST REWARDING FAMILY IN RUNNING |
    Then User logout of the application

  @Checkout_012
  Scenario: Verify whether the user is able to navigates to the checkout Membership (Math) page or not (Guest User).
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Continue as Guest and its navigation
      | Continue as Guest | SAVE 20% TODAY |

  @Checkout_013
  Scenario: Verify whether the JOIN VIP FAMILY text is displayed with uppercase at the top of the page for Hoka and Hoka mixed cart.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "MEN'S HOKA" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup for HOKA brand
      | Medium (Normal) | 9 | Black/Black | 1 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Continue as Guest for HOKA brand
      | Continue as Guest | JOIN VIP FAMILY |

  @Checkout_014
  Scenario: Verify whether Save 20% Today + Earn 10% in Rewards Cash When you join VIP Family Rewards text is displayed at the top of the page for non Hoka items in cart.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Continue as Guest
      | Continue as Guest | SAVE 20% TODAY | + Earn 10% in Rewards Cash When you join VIP Family Rewards |

  @Checkout_015
  Scenario: Verify whether the calculation of Reward Cash earned is correct or not
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Continue as Guest and Reward cash
      | Continue as Guest | SAVE 20% TODAY |

  @Checkout_016
  Scenario: Verify the application response when the user clicks on JOIN VIP and Continue Button.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Continue as Guest and Reward cash
      | Continue as Guest | SAVE 20% TODAY |
    And verify Join VIP Navigation
      | ADD VIP FOR $1.99 & CONTINUE | SHIPPING | ORDER SUMMARY |

  @Checkout_017
  Scenario: Verify whether the "No Thanks, I’ll Pay Full Price?" text is displayed above the Continue without VIP button and its functionality
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41636" and click on search button
    Then choosing SKU's and Navigate to ATC to verify Checkout Button
      | Abalone | L | 1 | Men's KORSA Ventilate UPF 50 Singlet |
    And Verify Checkout navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |

  @Checkout_018
  Scenario: Verify User direction the checkout page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |

  @Checkout_019
  Scenario: Verify functionality of header, RRS logo and Edit cart CTA button in checkout page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify the application response when the user clicks on Edit Cart CTA Button "cart"
    And Navigate Back to Checkout page and Verify the functionality of RRS Logo

  @Checkout_020
  Scenario: Verify the text displayed in 20% banner
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify the text displayed in 20% banner

  @Checkout_021
  Scenario: Verify Join for $1.99 CTA button and learn more link in VIP Join 20% banner
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify $1.99 CTA button and Learn more link
      | Join for $1.99 | Learn more | SAVE 20% TODAY!* |

  @Checkout_022
  Scenario: Verify Shipping section under Checkout page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Shipping section fields
      | abcd | efgh | xyz, 234 poickd | qwerty | phoenix | 85054 | abc123@gmail.com | 9234567810 | AZ - Arizona | United States |

  @Checkout_023
  Scenario: Verify Shipping Methods section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Shipping Method fields
      | Shipping Method | NON-VIP Standard Shipping | Upgraded Delivery | Express Delivery |

  @Checkout_024
  Scenario: Verify Order summary section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Order Summary Section
      | ORDER SUMMARY | Order Subtotal | Shipping | Tax | Est. Total | + I have a source code |

  @Checkout_025
  Scenario: Verify Shipping and Pickup at store Name under Cart section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Pickup at store Section
      | Cart (1) | Pickup at Tempe |

  @Checkout_026
  Scenario: Verify Payment section with different payment methods
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Payment Section
      | PAYMENT | I have a gift card | Credit Card | Klarna | PayPal | Place Order |

  @Checkout_027
  Scenario: Verify the gift card check box
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Gift Card Fields
      | Card Number | Pin | Apply | Add another gift card |

  @Checkout_028
  Scenario: Verify Credit card Payment method section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Credit Card Fields
      | Add New Card | Card Number | Name As It Appears On Card | Expiration Date | Month | Year | CVN | What's this? | My billing address is same as shipping address |

  @Checkout_029
  Scenario: Verify Paypal Payment method
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Paypal Payment method
      | PayPal |

  @Checkout_030
  Scenario: Verify Klarna Payment method
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |
    And User Click on Add to Cart Button
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Klarna Payment method
      | Klarna |

  @Checkout_032
  Scenario: Verify Place order CTA button
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "34519" and click on search button
    Then Verify Pickup in Store for selected products
      | Dark Navy | 9 | M | Women's KORSA Challenge 5" Short |
    Then Verify Pickup in Store name for selected products
      | Arizona | Tempe |
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

  @Checkout_033
  Scenario: Verify the text displayed in 2x cash banner( VIP PLUS) for VIP User
    Given User Land on the RRS home page after login with user
      | testcucumbervip@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Checkout Page and 2x Cash banner
      | JOIN THE MOST REWARDING FAMILY IN RUNNING | EARN 2X REWARDS CASH ON THIS ORDER WHEN YOU UPGRADE FOR FREE | join vip rewards plus & earn 5 10% in rewards cash: | No Thanks, I’ll Stick With 5% Rewards Cash: |
    Then User logout of the application

  @Checkout_034
  Scenario: Verify Upgrade for free CTA button in 2x Cash banner for VIP user
    Given User Land on the RRS home page after login with user
      | testcucumbervip@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Upgrade CTA button in  2x Cash banner
      | JOIN THE MOST REWARDING FAMILY IN RUNNING |
    Then User logout of the application

  @Checkout_035
  Scenario: Verify add new shipping address functionality
    Given User Land on the RRS home page after login with user
      | testcucumber@yopmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button
      | checkout |
    And verify Continue Without VIP Navigation
      | CONTINUE WITHOUT VIP | No Thanks, I’ll Pay Full Price: | SHIPPING | ORDER SUMMARY |
    And Verify Add new Address button
      | abcd | efgh | xyz, 234 poickd | qwerty | phoenix | 85054 | 9234567810 | AZ - Arizona | United States |

  @Checkout_036
  Scenario: Verify add Credit card in Credit card Payment method section
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
    And Enter Credit Card details
      | 4111111111111111 | xyzqwer | 01 | 25 | 123 |
    And Verify Order Confirmation Page
      | order-confirmation | Thank YOU abcd! |

  @Checkout_037
  Scenario: Verify Redeem my VIP Rewards Cash link in order summary section
    Given User Land on the RRS home page after login with user
      | betarewards1@yopmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Checkout from ATC Popup
      | JOIN THE MOST REWARDING FAMILY IN RUNNING |
    And verify Join VIP Navigation and redeem reward cash link
      | SHIPPING | ORDER SUMMARY | Redeem my VIP Rewards Cash | Redeem |
    Then User logout of the application

  @Checkout_038
  Scenario: Verify VIP acknowledgement checkbox when VIP is in cart
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Click Continue as Guest
      | Continue as Guest | SAVE 20% TODAY |
    And verify Join VIP Navigation
      | ADD VIP FOR $1.99 & CONTINUE | SHIPPING | ORDER SUMMARY |
    And Verify VIP Acknowledgement checkbox
      | YES, I WANT TO JOIN VIP FAMILY REWARDS TO GET ALL THE GREAT SAVINGS OF THE VIP FAMILY REWARDS MEMBERSHIP! | Place Order | #757575 | #325a17 | *Please check box above to acknowledge VIP membership terms and conditions |

 	
  Scenario: Verify VIP Plus acknowledgement checkbox when VIP plus is in cart
    Given User Land on the RRS home page after login with user
      | testcucumbervip@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And verify Join VIP Plus Navigation
      | JOIN THE MOST REWARDING FAMILY IN RUNNING |
    And Verify VIP Acknowledgement checkbox
      | YES, I WANT TO JOIN VIP REWARDS PLUS TO GET ALL THE GREAT SAVINGS OF THE VIP REWARDS PLUS MEMBERSHIP! | Place Order | #757575 | #325a17 | *Please check box above to acknowledge VIP membership terms and conditions |
    And Remove the Item from Cart
    Then User logout of the application
