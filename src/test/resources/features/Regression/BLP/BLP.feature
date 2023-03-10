#Author: R.Karthik
@BLP_Full @RegressionSuite_Full
Feature: BLP Regression Scripts

  @BLP_001
  Scenario: Verify Brands from Top navigation menu
    Given User Lauch RRS application and navigate to home page
    Then Verify whether the Sub categories of brand are displayed
      | BEST SELLING | FEATURED |

  @BLP_002
  Scenario: Verify Brands page
    Given User Lauch RRS application and navigate to home page
    Then Verify navigation of Brands in Top Navigation Menu
      | brands | in order |

  @BLP_003
  Scenario: Verify users direction to Brands Landing page from Brand page
    Given User Lauch RRS application and navigate to home page
    Then Verify navigation of Brands in Top Navigation Menu
      | brands | in order |
    And Verify on clicking of Alphabet "C"
    And Validate Navigation of Particular Brand Page "Adidas"

  @BLP_004
  Scenario: Verify Large, Medium, Small brand pages
    Given User Lauch RRS application and navigate to home page
    Then Verify navigation of Brands
      | brands |
    And Verify clicking on Large Brand
      | Brooks | Women's | Men's | Apparel |
    And Verify clicking on Medium Brand
      | Merrell |
    And Verify clicking on Small Brand
      | GU |

  @BLP_005
  Scenario: Verify user's direction to Category products from Brand landing page
    Given User Lauch RRS application and navigate to home page
    Then Verify navigation of Brands
      | brands |
    And Validate Navigation of Particular Brand Page "Adidas"
    And Validate Navigation of Particular Gender Category Page
      | Adidas | Women's |
