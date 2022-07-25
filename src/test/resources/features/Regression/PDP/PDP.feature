#Author: R.Karthik
@RegressionSuite_Full
Feature: PDP Regression Scripts

  @Regression_RK_001
  Scenario: Verify Users direction to PDP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page on clicking of Product

  @Regression_RK_002
  Scenario: Verify Bread crumb in the PDP page
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify Bread Crumb and its navigation

  @Regression_RK_003
  Scenario: Verify the Product name displayed in PDP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify Product name is Displayed or not

  @Regression_RK_004
  Scenario: Verify whether Color SKUs are sorted alphabetically or not
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify color SKUs are sorted alphabetically or not
    | alt |
    
 @Regression_RK_005
  Scenario: Verify whether Size SKUs are orderly sorted  or not
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify size SKUs are sorted orderly or not
    | alt |
