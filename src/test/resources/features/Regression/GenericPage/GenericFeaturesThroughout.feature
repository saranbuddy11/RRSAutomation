#Author:Sairam
@Generic_Features @RegressionSuite_Full
Feature: Generic Features Regression scripts

  @Generic_1.1
  Scenario: Verify Expert Advice link is clickable or not
    Given User Land on the RRS home page
    And User Clicks on Expert Advice link at top right corner of the header
    And User Lands on Blog Site

  @Generic_1.2
  Scenario: Verify Help link is clickable or not
    Given User Land on the RRS home page
    And User Clicks on Help link at top right corner of the header
    And User Lands on Contact Us Page

  @Generic_1.3
  Scenario: Verify VIP Program menu
    Given User Land on the RRS home page
    And User hovers on VIP Program Menu link at top right corner of the header
    And User Validates VIP Dropdown list "VIP Family Rewards Membership"
    And User Validates VIP Dropdown list "VIP Family Rewards Plus Membership"
    And User Validates VIP Dropdown list "My Rewards Cash Balance"
    And User Validates VIP Dropdown list "VIP Blog"
    And User Validates VIP Dropdown list "VIP Exclusive Shoe Calendar"
    And User Validates VIP Dropdown list "Race Network"

  @Generic_1.4
  Scenario: Verify the application response when the user clicks on VIP Family Rewards Membership in the VIP Program drop-down menu
    Given User Land on the RRS home page
    And User hovers on VIP Program Menu link at top right corner of the header
    And User Clicks on "VIP Family Rewards Membership" in the Drop down

  @Generic_1.5
  Scenario: Verify the Cart icon in the header
    Given User Land on the RRS home page
    And User Sees blank cart if no items are added to cart
    And User Clicks on Cart icon and navigates to Empty Cart page

  @Generic_1.6
  Scenario: Verify top navigation menus and categories on top navigation menu are clickable or not
    Given User Land on the RRS home page
    And User Hovers on Top Navigation Menu
    And User Clicks on any of the Category link in the Top navigation Drop down
    And User navigates to Respective Category Landing Page

  @Generic_1.7
  Scenario: Verify Sub Categories in Top Navigation are clickable or not
    Given User Land on the RRS home page
    And User Hovers on Top Navigation Menu
    And User Clicks on any of the Sub Category link in the Top navigation Drop down
    And User navigates to Respective Product Listing Page

  @Generic_1.8
  Scenario: Verify Response if user clicks Brands in Top Navigation
    Given User Land on the RRS home page
    And User Clicks on Brands in the Top Navigation
    And User Lands on Brand Landing Page

  @Generic_1.9
  Scenario: Verify the Fit Finder menu in top navigation
    Given User Land on the RRS home page
    And User Clicks on Fit Finder in the Top Navigation
    And User Lands on Perfect Fit Finder Page

  @Generic_2.0
  Scenario: Verify Back to top functionality
    Given User Land on the RRS home page
    And User Scrolls down till the bottom to see Back to Top Icon
    And User Clicking on the Back to Top Icon navigates to top of the page

  @Regression_RK_015
  Scenario: Verify the Cart icon in the header
    Given User Land on the RRS home page
    When User Verify on Blank cart Icon is Displayed
    And User Clicks on Cart Icon
    Then User navigate to Cart Page and validates the message
    And User Clicks on continue shopping button
    Then User navigate back to Home page

  @Regression_RK_016
  Scenario: Verify item count in Cart icon
    Given User Land on the RRS home page
    When User Search for a particular product "40135" and click on search button
    And User Select the color variant "Pale Grey" and size "L"
    And User click on Add to Cart button and Click Continue Shopping
    And User Verify on Item count on Cart and Clicks on Cart Icon
    Then User navigate to Cart Page and validates the Items displayed
    Then User navigate back to Home page
    And User Verify on Item count on Cart and Clicks on Cart Icon

  @Regression_RK_017
  Scenario: Verify top navigation menus and categories on top navigation menu are clickable or not
    Given User Land on the RRS home page
    When User verifies Top navigation Menu should be displayed in the given order as follows
      | Women | Men | Kids | Gear | Brands | Outlet | Gift Cards | Fit Finder | VIP Family Rewards |
    And User should be able to hover on the top nav menu and should able to see listed Categories displayed under the top navigation menu.
    And User should able to click Categories and directed to respective PLP Page "women" and "Running"

  @Regression_RK_018
  Scenario: Verify Women tab in top navigation menu is displayed with categories or not
    Given User Land on the RRS home page
    When User should be able to hover on top nav menu of women
    Then Verify SHOE, APPAREL and Top performing picks categories should be displayed in the Women top navigation menu
      | WOMEN'S SHOES | WOMEN'S APPAREL | TOP PERFORMING PICKS |

  @Regression_RK_019
  Scenario: Verify the Sub categories of SHOE in Women top naviagtion menu
    Given User Land on the RRS home page
    When User should be able to hover on top nav menu of women
    And Verify whether the Sub categories of SHOES are displayed
      | Running | Trail | Cross Training | Racing | Sandals | Walking | Casual | Hiking | Track & Field | Cross Country | Tennis & Volleyball | Endangered Shoes | New Shoes | Women�s Outlet Shoes | VIP Exclusive Shoe Calendar |
    Then User should able to click Categories and directed to respective PLP Page "women" and "Running"

  @Regression_RK_020
  Scenario: Verify Kids tab in top navigation menu
    Given User Land on the RRS home page
    When User should be able to hover on top nav menu of kids
    And Verify whether the Sub categories of kids are displayed with banner and validate the navigation
      | BOYS | GIRLS | catalog | kids |

  @Regression_RK_021
  Scenario: Verify the Sub categories of Accesories, Electronics, Equipment, Nutrition, Personal Care categories in Gear top naviagtion menu
    Given User Land on the RRS home page
    When User should be able to hover on top nav menu of gear
    And Verify whether the Sub categories of gear are displayed and validate the navigation
      | ACCESSORIES | EQUIPMENT | NUTRITION | PERSONAL CARE | category/accessories/gloves | RUNNING GLOVES |