#Author: Sivaram
@HomePage_Full @RegressionSuite_Full
Feature: Home Page Regression scripts - VIP Login User

  @homePage_VipUser_001 @homePage_VipUser_002 @homePage_VipUser_003 @homePage_VipUser_004
  Scenario Outline: Verify User details in Home Page for VIP User logined user
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert "VIP" user details display at Account Icon section
    And Assert user name details display at Top Banner
    And Assert VIP Cash Rewards details is displayed

    Examples: 
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @homePage_VipUser_005 @homePage_VipUser_006 @homePage_VipUser_007 @homePage_VipUser_008
  Scenario Outline: Verify History Section displayed for VIP User
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert "VIP" user History Section is displayed
    And Assert Item details are displayed in History Section
    And Assert Recently Ordered Product details are displayed in History Section
    And Assert Recommended for you Product details are displayed in History Section
    And Assert wearometer is displayed on Product details in History Section

    Examples: 
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @homePage_VipUser_010
  Scenario Outline: Verify FIND YOUR PERFECT FITTING SHOES FAST section is displayed
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert FIND YOUR PERFECT FITTING SHOES FAST section is displayed
    And Assert Start Your Online Fitting button is clickable

    Examples: 
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @homePage_011
  Scenario Outline: Verify TODAYS TOP SELLERS IN AMERICA section is displayed
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert TODAYs TOP SELLERS IN AMERICA section is displayed
    And Assert Shop All button is clickable in TODAYS TOP SELLERS IN AMERICA section

    Examples: 
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @homePage_012
  Scenario Outline: Verify LOVE BROOKS? HEREs THEIR NEWEST! section is displayed
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    And Assert LOVE BROOKS? HERES THEIR NEWEST! section is displayed
    And Assert Shop All button is clickable in LOVE BROOKS? HERES THEIR NEWEST! section

    Examples: 
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @homePage_013
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
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @homePage_014
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

  @Regression_RK_009
  Scenario: Verify whether the Home Page featured 3 Catagories at a time and categories are clickable or not
    Given User Land on the RRS home page after login with VIP user
      | testcucumbervip@gmail.com | 123456 |
    And User should able to see three featured categories in home page
    When Verify navigation of Clicking on feature in home page
