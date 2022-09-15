#Author: R.Karthik
@RegressionSuite_Full
Feature: Custom Query Scripts

  @Regression_RK_001
  Scenario Outline: Verify Custom query URL
    Given User Lauch RRS application and navigate to home page
    When Click on Custom query links <CustomQuery>
    Then Validate the header of the page <CustomQuery>
    And Validate the query URL "z=true"

    Examples: 
      | CustomQuery                                                                           |
      | https://uat.roadrunnersports.com/search/KORSA_Unpredictable_Weather_Collection&z=true |
      | https://uat.roadrunnersports.com/search/KORSA_Hot_Day_Runs_Collection&z=true          |
      | https://uat.roadrunnersports.com/search/KORSA_On_The_Trail_Collection&z=true          |
      | https://uat.roadrunnersports.com/search/KORSA_Active_Recovery_Collection&z=true       |
      | https://uat.roadrunnersports.com/search/Hybrid%20Run%20and%20Train%20Shoes&z=true     |
      | https://uat.roadrunnersports.com/search/Hydration%20Collection%202022&z=true          |
