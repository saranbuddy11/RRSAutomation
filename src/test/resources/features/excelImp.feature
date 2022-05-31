#Author: 

Feature: Excel implementation

  @login_excel_NImp
    Scenario Outline: Login to RRS site with VIP credentials
    Given User Land on the RRS home page
    And User click on Login Image button in Home Page
    And User enter the credentials of the user <User>
		And User click on Login button
		Then user validate the successful login
    
     Examples: 
      |User|
      |VIP1|