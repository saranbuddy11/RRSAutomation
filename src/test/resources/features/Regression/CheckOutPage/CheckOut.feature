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
