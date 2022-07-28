#Author: Sivaram
@Myaccount_Full @RegressionSuite_Full
Feature: My account Smoke scripts

  @myaccount_001 @myaccount_002 @myaccount_003 @myaccount_004
  Scenario Outline: Verify My Account
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User Assert My Account modal popup
    And User click on Forgot my password link in the screen
    And User enter the forget password email ID "rrs_forgotpwd_smoke@gmail.com" and click on Send Email button
    Then User Assert the confirmation of password reset link sent to mentioned email ID "rrs_forgotpwd_smoke@gmail.com"
    And User Click on Close button in the forget password confirmation screen

    Examples: 
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @myaccount_007
  Scenario Outline: Verify user is able to login to an existing account
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the credentials of the user <User>
    And User click on Login button
    Then user validate the successful login
    Then User logout of the application

    Examples: 
      | User |
      | VIP2 |

  @myaccount_008
  Scenario Outline: Verify whether the user is able to login to the account with invalid data.
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    Then Assert application displays appropriate error message for invalid Login

    Examples: 
      | Email                       | Password |
      | testvipuserss01@yopmail.com | 123456s  |

  @myaccount_009
  Scenario: Verify user is able to create an account
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And user click on New account
    And User enter new Random Email ID and Password
    And User enter confirm password
    And User click on Create Account
    Then User validate successful account creation
    Then User logout of the application

  @myaccount_010
  Scenario: Verify user direction to Login page from Footer-My account section
    Given User Land on the RRS home page
    And User click on "My Account" link in footer
    And User Assert account login page

  @myaccount_011
  Scenario: Verify user direction to Login page from Header-VIP Drop down program
    Given User Land on the RRS home page
    And User hovers on VIP Program Menu link at top right corner of the header
    And User Validates VIP Dropdown list "My Rewards Cash Balance"
    And User click on "My Rewards Cash Balance" link in VIP Drop down
    And User Assert account login page

  @myaccount_012
  Scenario: Verify user direction to Login page from Footer-Check Order Status section
    Given User Land on the RRS home page
    And User click on "orders" link in footer
    And User Assert account login page

  @myaccount_013
  Scenario: Verify user direction to Login page from Footer-Contact Us section
    Given User Land on the RRS home page
    And User click on "contact-us" link in footer
    And Assert Contact US is displayed
    And User click on GO TO YOUR ACCOUNT button
    And User Assert account login page

  @myaccount_014
  Scenario: Verify user direction to Login page from Footer-FAQs section
    Given User Land on the RRS home page
    And User click on "/faq" link in footer
    And Assert FAQs is displayed
    And User click on YOUR ACCOUNT link
    And User swith to newly opened window
    And User Assert account login page

  @myaccount_015
  Scenario: Verify user direction to Login page from Footer-My account section
    Given User Land on the RRS home page
    And User click on "My Account" link in footer section
    And User Assert account login page
    Then User ensure appliction not displaying my account page

  @myaccount_016 @myaccount_017 @myaccount_018 @myaccount_019 @myaccount_020
  Scenario Outline: Verify My Account for VIP User
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    Then User click on My account button in Home Page
    And User validates list of dashboard pages
    And User validates My Details in My account page
    And User validates VIP Savings section details
    And User validates VIP Rewards Cash Balance section details
    And User validates Gurantee section details
    And User click on See All orders button
    Then User verify MY ORDERS page with previous order details

    Examples: 
      | Email                     | Password |
      | testvipuser01@yopmail.com |   123456 |

  @myaccount_021 @Siva
  Scenario Outline: Verify My Account for Non-VIP User
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
    And User click on Login button
    Then User click on My account button in Home Page
    And User validates list of dashboard pages
    And User validates My Details for Non-VIP user in My account page
    And User validates Free Shopping section details
    And User click on See All orders button for Non-VIP user
    Then User verify MY ORDERS page with previous order details

    Examples: 
      | Email                  | Password |
      | testuser2022@gmail.com |   123456 |
