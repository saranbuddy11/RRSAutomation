#Author: Sairam
@Myaccount_RRS @RegressionSuite_Full
Feature: My account Regression scripts

  @myaccount_1.0 @RegressionSuite
  Scenario Outline: Verify My Account
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
		And User click on Login button
		Then User click on My account button in Home Page
		And User validates list of dashboard pages
		
    
     Examples: 
      |Email|Password|
      |testvipuser01@yopmail.com|123456|
      
      
      
      
  @myaccount_1.1 @RegressionSuite
  Scenario Outline: Verify My Details section
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the VIP user Email address <Email>
    And User enter the VIP user Password <Password>
		And User click on Login button
		Then User click on My account button in Home Page
		And User validates My Details in My account page
		
    
     Examples: 
      |Email|Password|
      |testvipuser01@yopmail.com|123456|
      
      
      

      
      
       
        
    
   