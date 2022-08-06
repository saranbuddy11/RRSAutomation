#Author: R.Karthik
@RegressionSuite_Full
Feature: Checkout Regression Scripts

  @Regression_RK_001
  Scenario: Verify whether the user is able to navigates to the start checkout page or not.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |

  @Regression_RK_002
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

  @Regression_RK_003
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

  @Regression_RK_004
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

  @Regression_RK_005
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

  @Regression_RK_006
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

  @Regression_RK_007
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

  @Regression_RK_008
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

  @Regression_RK_009
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

  @Regression_RK_010
  Scenario: Verify whether the Logged in NONVIP user is able to navigates to the Checkout Membership page or not.
    Given User Land on the RRS home page after login with non VIP user
      | testcucumber@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Checkout Page
      | SAVE 20% TODAY |
    Then User logout of the application

  @Regression_RK_011
  Scenario: Verify whether the Logged in VIP user with VIP Plus in cart/Logged in VIP plus user is able to navigates to the Checkout Membership page or not.
    Given User Land on the RRS home page after login with non VIP user
      | testcucumbervip@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | M | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Checkout Page
      | JOIN THE MOST REWARDING FAMILY IN RUNNING |
    Then User logout of the application

  @Regression_RK_012
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

  @Regression_RK_013
  Scenario: Verify whether the JOIN VIP FAMILY text is displayed with uppercase at the top of the page for Hoka and Hoka mixed cart.
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "MEN'S HOKA" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup for HOKA brand
      | Medium (Normal) | 9 | Goblin Blue/Orange | 1 |
    And User Click on Checkout Button and verify its navigation
      | checkout | START CHECKOUT |
    And Verify Continue as Guest for HOKA brand
      | Continue as Guest | JOIN VIP FAMILY |

  @Regression_RK_014
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

  @Regression_RK_015
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

  @Regression_RK_016
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

  @Regression_RK_017
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

  @Regression_RK_018
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

  @Regression_RK_019
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

  @Regression_RK_020
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

  @Regression_RK_021
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

  @Regression_RK_022
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

  @Regression_RK_023
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

  @Regression_RK_024
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

  @Regression_RK_025
  Scenario: Verify Shipping and Pickup at store Name under Cart section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
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

  @Regression_RK_026
  Scenario: Verify Payment section with different payment methods
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
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

  @Regression_RK_027
  Scenario: Verify the gift card check box
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
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

  @Regression_RK_028
  Scenario: Verify Credit card Payment method section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then Verify Pickup in Store for selected products
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
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
