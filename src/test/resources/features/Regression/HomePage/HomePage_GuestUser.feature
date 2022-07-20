#Author: Sivaram
@HomePage_Full @RegressionSuite_Full  @Siva
Feature: Home Page Regression scripts - Guest User/ Non-Logged-in User

  @homePage_001 @homePage_002
  Scenario: Verify Home page Top Banner and Start My Fitting Now Button
    Given User Land on the RRS home page
    And Assert Top banner is displayed for Guest user
    And Assert Start My Fitting Now button is clickable

  @homePage_004 @homePage_005 
  Scenario: Verify Home page featured Categories
    Given User Land on the RRS home page
    And Assert Categories banner has appropriate categories name
    And Assert 3 categories are displayed
    Then User click on "Shop Women" in Running shoes category
    And User Assert "women's running shoes" page is displayed

  @homePage_006 
  Scenario: Verify Home page Sub Categories - SHOP BY CATEGORY
    Given User Land on the RRS home page
    And Assert 6 sub Categories are displayed under SHOP BY CATEGORY
    Then User click on "America's Top Running Shoes" in SHOP BY CATEGORY
    And User Assert "Running Shoes" page is displayed

  @homePage_007 @homePage_008
  Scenario: Verify Home page Sub Categories - SHOP BY BRAND
    Given User Land on the RRS home page
    And Assert 6 sub Categories are displayed under SHOP BY BRAND
    And Assert Shop All Brands button is clickable
    Then User click on "Brooks Brand" in SHOP BY BRAND
    And User Assert "BROOKS" page is displayed for SHOP BY BRAND

  @homePage_009
  Scenario: Verify FIND YOUR PERFECT FITTING SHOES FAST! section in Home Page
    Given User Land on the RRS home page
  	And Assert FIND YOUR PERFECT FITTING SHOES FAST section is displayed
  	And Assert Start Your Online Fitting button is clickable
  	
  @homePage_010
  Scenario: Verify VIP Program Banner in Home Page
    Given User Land on the RRS home page
  	And Assert VIP Program Banner is displayed
  	And Assert Become a VIP button is clickable
  	
  @homePage_013 
  Scenario: Verify VIP Program Banner in Home Page
    Given User Land on the RRS home page
  	And Assert VIP Program Banner is displayed
  	And Assert Learn More button is clickable
  	
  @homePage_011 
  Scenario: Verify THIS WEEKS MOST-ASKED-FOR SHOE section in Home Page
    Given User Land on the RRS home page
  	And Assert THIS WEEKS MOST-ASKED-FOR SHOES section is displayed
  	And Assert Shop All button is clickable in THIS WEEKS MOST-ASKED-FOR SHOE section
  
  @homePage_012
  Scenario: Verify YOUR BESTSELLING PERFORMANCE APPAREL section in Home Page
    Given User Land on the RRS home page
  	And Assert YOUR BESTSELLING PERFORMANCE APPAREL section is displayed
  	And Assert Shop All button is clickable in YOUR BESTSELLING PERFORMANCE APPAREL section
  
  	
  	