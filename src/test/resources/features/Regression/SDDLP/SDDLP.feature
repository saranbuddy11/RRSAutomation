#Author: R.Karthik
@RegressionSuite_Full
Feature: SDDLP Regression Scripts

  @Regression_RK_001
  Scenario: Verify search Text box
    Given User Lauch RRS application and navigate to home page
    Then Verify Search Bar and its Icon
      | What are you looking for? | placeholder |

  @Regression_RK_002
  Scenario: Verify SAYT feature in the search text box
    Given User Lauch RRS application and navigate to home page
    Then Verify Searching Functionality
      | qwer1234*@#%^)!<>"ASD | value | sh | Categories | Brands |

  @Regression_RK_003
  Scenario: Verify Remove icon and Clear link in the Search text box
    Given User Lauch RRS application and navigate to home page
    Then Verify Remove Icon and Clear Link
      | sh | value |

  @Regression_RK_004
  Scenario: Verify auto suggest keyword click response
    Given User Lauch RRS application and navigate to home page
    When Verify auto Suggested Keyword Click response
      | shoe | value |
    Then Verify Navigation of Page to PDP Page
      | product | mens |

  @Regression_RK_005
  Scenario: Verify users direction to No search results page
    Given User Lauch RRS application and navigate to home page
    Then Verify No Search Results page
      | pen | value | search |

  @Regression_RK_006
  Scenario: Verify Bread Crumb in the Search listing page
    Given User Lauch RRS application and navigate to home page
    Then Verify Search Results page
      | shoe | value | search |
    And Verify Navigation Back to Home Page
      | WELCOME TO YOUR PERFECT FIT |

  @Regression_RK_007
  Scenario: Verify the search results page
    Given User Lauch RRS application and navigate to home page
    Then Verify Search Results page and its results
      | shoe | value | search |

  @Regression_RK_008
  Scenario: Verify filters applied in Search results page
    Given User Lauch RRS application and navigate to home page
    Then Verify Search Results page
      | shoe | value | search |
    And Verify applied filters result
      | Walking |

  @Regression_RK_009
  Scenario: Verfiy search with brand name and product name
    Given User Lauch RRS application and navigate to home page
    Then Verify Search Results for brand page
      | korsa | value | search |
    And Verify navigation of brand page
      | KORSA | brands |
