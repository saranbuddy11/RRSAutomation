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
      | CustomQuery                                                                               |
      | https://uat.roadrunnersports.com/search/Hybrid%20Run%20and%20Train%20Shoes&z=true         |
      | https://uat.roadrunnersports.com/search/Hydration%20Collection%202022&z=true              |
      | https://uat.roadrunnersports.com/search/WomensRunShorts&z=true                            |
      | https://uat.roadrunnersports.com/search/MensRunShorts&z=true                              |
      | https://uat.roadrunnersports.com/search/WomensRunTops&z=true                              |
      | https://uat.roadrunnersports.com/search/MensRunTops&z=true                                |
      | https://uat.roadrunnersports.com/search/WomensRunBottoms&z=true                           |
      | https://uat.roadrunnersports.com/search/MensRunBottoms&z=true                             |
      | https://uat.roadrunnersports.com/search/WomensRunJacket&z=true                            |
      | https://uat.roadrunnersports.com/search/MensRunJacket&z=true                              |
      | https://uat.roadrunnersports.com/search/KORSA_Unpredictable_Weather_Collection&z=true     |
      | https://uat.roadrunnersports.com/search/KORSA_Hot_Day_Runs_Collection&z=true              |
      | https://uat.roadrunnersports.com/search/KORSA_On_The_Trail_Collection&z=true              |
      | https://uat.roadrunnersports.com/search/KORSA_Gym_Days_Collection&z=true                  |
      | https://uat.roadrunnersports.com/search/KORSA_Active_Recovery_Collection&z=true           |
      | https://uat.roadrunnersports.com/search/Nathan%20Hydration&z=true                         |
      | https://uat.roadrunnersports.com/search/Nathan%20Safety_Running&z=true                    |
      | https://uat.roadrunnersports.com/search/Nathan%20Hydration%20Vests_Packs&z=true           |
      | https://uat.roadrunnersports.com/search/Nathan%20Hydration%20Handheld&z=true              |
      | https://uat.roadrunnersports.com/search/Nathan%20Hydration%20Belts&z=true                 |
      | https://uat.roadrunnersports.com/search/Nathan%20Storage&z=true                           |
      | https://uat.roadrunnersports.com/search/Nathan%20Safety&z=true                            |
      | https://uat.roadrunnersports.com/search/Garmin%20Race%20Predictor&z=true                  |
      | https://uat.roadrunnersports.com/search/Garmin%20Triathlon/Multisport%20Activities&z=true |
      | https://uat.roadrunnersports.com/search/Garmin%20Solar%20Charging&z=true                  |
      | https://uat.roadrunnersports.com/search/Garmin%20Mapping%20and%20Routing&z=true           |
      | https://uat.roadrunnersports.com/search/Garmin%20Compass&z=true                           |
      | https://uat.roadrunnersports.com/search/CamelBak%20Belts/Vests&z=true                     |
      | https://uat.roadrunnersports.com/search/ProTec%20Knee&z=true                              |
