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
      | aria-label |

  @Regression_RK_006
  Scenario: Verify Review star and review links in PDP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page of selecting particular item
      | Women's ASICS GEL-Kayano 28 |
    And Verify number of reviews and star ratings
      | reviews |
    And Verify navigation when clicks on Reviews
      | Review Snapshot |

  @Regression_RK_007
  Scenario: Verify Review counts displayed in the PDP are matching from PLP or not
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page with review count
      | Women's ASICS GEL-Kayano 28 |
    And Verify number of reviews count
      | reviews |

  @Regression_RK_008
  Scenario: Verify Outlet Products in PDP
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41654" and click on search button
    Then Verify the product and its prices
      | Women's KORSA Performer Ventilated Crop Bra | SALE | $ | When you join our VIP Family |

  @Regression_RK_009
  Scenario: Verify Product displayed with Colour, Size and Width
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify SKUs of the product
      | Color | Size | Width |

  @Regression_RK_010
  Scenario: Verify thumbnail images and vidoes in PDP page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page of selecting particular item
      | Women's ASICS GEL-Kayano 28 |
    And Verify thumbnail images and videos

  @Regression_RK_011
  Scenario: Verify product images in PDP
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41654" and click on search button
    Then Verify Product image
      | aria-label | Previous | Next | class | hidden |
