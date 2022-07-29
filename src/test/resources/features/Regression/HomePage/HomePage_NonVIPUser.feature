#Author: Sivaram
@HomePage_Full @RegressionSuite_Full 
Feature: Home Page Regression scripts - Non-VIP Login User

  @homePageNonVIPUser_001 @homePageNonVIPUser_003
  Scenario Outline: Verify User details in Home Page for VIP User logined user
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the user Email address <Email>
    And User enter the user Password <Password>
    And User click on Login button
    And Assert "Non-VIP" user details display at Account Icon section

    Examples: 
      | Email                  | Password |
      | testuser2022@gmail.com |   123456 |

  @homePageNonVIPUser_004 @homePageNonVIPUser_005 @homePageNonVIPUser_007
  Scenario Outline: Verify History Section displayed for VIP User
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert "Non-VIP" user History Section is displayed
    And Assert Item details are displayed in History Section
    And Assert Recently Ordered Product details are displayed in History Section
    And Assert Recommended for you Product details are displayed in History Section
    And Assert wearometer is displayed on Product details in History Section

    Examples: 
      | Email                  | Password |
      | testuser2022@gmail.com |   123456 |

  @homePageNonVIPUser_008
  Scenario Outline: Verify FIND YOUR PERFECT FITTING SHOES FAST section is displayed
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert FIND YOUR PERFECT FITTING SHOES FAST section is displayed
    And Assert Start Your Online Fitting button is clickable

    Examples: 
      | Email                  | Password |
      | testuser2022@gmail.com |   123456 |

  @homePageNonVIPUser_009
  Scenario: Verify VIP Program Banner in Home Page
    Given User Land on the RRS home page
    And Assert VIP Program Banner is displayed
    And Assert Become a VIP button is clickable

  @homePageNonVIPUser_010
  Scenario Outline: Verify TODAYS TOP SELLERS IN AMERICA section is displayed
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert TODAYs TOP SELLERS IN AMERICA section is displayed
    And Assert Shop All button is clickable in TODAYS TOP SELLERS IN AMERICA section

    Examples: 
      | Email                  | Password |
      | testuser2022@gmail.com |   123456 |

  @homePageNonVIPUser_011
  Scenario Outline: Verify LOVE BROOKS? HEREs THEIR NEWEST! section is displayed
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert LOVE BROOKS? HERES THEIR NEWEST! section is displayed
    And Assert Shop All button is clickable in LOVE BROOKS? HERES THEIR NEWEST! section

    Examples: 
      | Email                  | Password |
      | testuser2022@gmail.com |   123456 |

  @homePageNonVIPUser_012
  Scenario Outline: Verify YOUR FAVORITE SHOPS section is displayed
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert YOUR FAVORITE SHOPS section is displayed
    Then User click on "BROOKS" in YOUR FAVORITE SHOPS section
    And User Assert "BROOKS" page is displayed for SHOP BY BRAND

    Examples: 
      | Email                  | Password |
      | testuser2022@gmail.com |   123456 |

  @homePageNonVIPUser_013
  Scenario Outline: Verify VIP FAMILY BESTSELLING PERFORMANCE APPAREL section is displayed
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert VIP FAMILY BESTSELLING PERFORMANCE APPAREL is displayed
    Then User click on "Men’s KORSA Premier Run SS" in VIP FAMILY BESTSELLING PERFORMANCE APPAREL Category
    And User Assert "MEN'S KORSA PREMIER RUN SHORT SLEEVE" product details page is displayed

    Examples: 
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @homePageNonVIPUser_014
  Scenario: Verify VIP Program Banner in Home Page
    Given User Land on the RRS home page
    And Assert VIP Program Banner is displayed
    And Assert Learn More button is clickable