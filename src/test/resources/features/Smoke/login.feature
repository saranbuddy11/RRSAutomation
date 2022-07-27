#Author: Mohanraj
@Login_Full @SmokeSuite_Full
Feature: login Smoke scripts

  @login_2.1 
 Scenario: Verify user is able to create an account
  	Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And user click on New account
    And User enter new Random Email ID and Password
    And User enter confirm password
    And User click on Create Account
    Then User validate successful account creation
    Then User logout of the application


  @login_2.2
  Scenario Outline: Verify user is able to login to an existing account
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the credentials of the user <User>
		And User click on Login button
		Then user validate the successful login
		Then User logout of the application
    
     Examples: 
      |User|
      |VIP2|
      
  @login_2.3 
 	Scenario: Verify user is able to use forget password functionality
		Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User click on Forgot my password link in the screen
    And User enter the forget password email ID "rrs_forgotpwd_smoke@gmail.com" and click on Send Email button
    Then User Assert the confirmation of password reset link sent to mentioned email ID "rrs_forgotpwd_smoke@gmail.com"
    And User Click on Close button in the forget password confirmation screen
    
   