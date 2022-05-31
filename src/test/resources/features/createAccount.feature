@test_feb14
Feature:  Smoke script fot login feature

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
