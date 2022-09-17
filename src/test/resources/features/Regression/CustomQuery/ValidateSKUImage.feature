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
  Scenario: Verify whether black color SKU image is displayed in the  Outfit Your section or not
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify whether black color of SKU image is displayed in the PLPs or not
