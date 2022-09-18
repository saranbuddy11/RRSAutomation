#Author: R.Karthik
@RegressionSuite_Full
Feature: Validate SKU Image color Scripts

  @Regression_RK_001
  Scenario: Verify whether black color SKU image is displayed in the PLPs or not
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify whether black color of SKU image is displayed in the PLPs or not

  @Regression_RK_002
  Scenario: Verify whether black color SKU image is displayed in the Outfit Your section or not
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Scroll to Outfit your Run Section
    And Verify whether black color of SKU image is displayed in OutFit your run section

  @Regression_RK_003
  Scenario: Verify whether black color SKU image is displayed in the You may also like section or not
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Scroll to Outfit your Run Section
    And Verify whether black color of SKU image is displayed in You may also like section

  @Regression_RK_004
  Scenario: Verify  whetherblack color SKU image is displayed in the Top picks for you section or not
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "38190" and click on search button
    Then choosing SKU's and Navigate to ATC
      | Black/White | 9 | Medium (Normal) | Men's adidas Solar Boost 3 |
    And Verify whether black color of SKU image is displayed in Top picks for you section
