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
      | CustomQuery                                              |
      | search/Hybrid%20Run%20and%20Train%20Shoes&z=true         |
      | search/Hydration%20Collection%202022&z=true              |
      | search/WomensRunShorts&z=true                            |
      | search/MensRunShorts&z=true                              |
      | search/WomensRunTops&z=true                              |
      | search/MensRunTops&z=true                                |
      | search/WomensRunBottoms&z=true                           |
      | search/MensRunBottoms&z=true                             |
      | search/WomensRunJacket&z=true                            |
      | search/MensRunJacket&z=true                              |
      | search/KORSA_Unpredictable_Weather_Collection&z=true     |
      | search/KORSA_Hot_Day_Runs_Collection&z=true              |
      | search/KORSA_On_The_Trail_Collection&z=true              |
      | search/KORSA_Gym_Days_Collection&z=true                  |
      | search/KORSA_Active_Recovery_Collection&z=true           |
      | search/Nathan%20Hydration&z=true                         |
      | search/Nathan%20Safety_Running&z=true                    |
      | search/Nathan%20Hydration%20Vests_Packs&z=true           |
      | search/Nathan%20Hydration%20Handheld&z=true              |
      | search/Nathan%20Hydration%20Belts&z=true                 |
      | search/Nathan%20Storage&z=true                           |
      | search/Nathan%20Safety&z=true                            |
      | search/Garmin%20Race%20Predictor&z=true                  |
      | search/Garmin%20Triathlon/Multisport%20Activities&z=true |
      | search/Garmin%20Solar%20Charging&z=true                  |
      | search/Garmin%20Mapping%20and%20Routing&z=true           |
      | search/Garmin%20Compass&z=true                           |
      | search/CamelBak%20Belts/Vests&z=true                     |
      | search/ProTec%20Knee&z=true                              |
