#Author: 

@PLP_Full @RegressionSuite_Full
Feature: PLP Regression Scripts

  @PLP_3.1
  Scenario: Verify user direction to PLP Page
  	Given User Land on the RRS home page
		And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
    Then Assert user is direceted to appropriate PLP page for the keyword used
    
  @PLP_3.2
  Scenario: Verify the page results by clicking on any of the options under "Sort By"
  	Given User Land on the RRS home page
  	And User Search for a product with some keywords "WOMEN ASCIS" and click on search button
  	Then Assert user is direceted to appropriate PLP page for the keyword used
  	And User store the number of search results to a variable
  	And User select "Price: Low to High" Sort by value from the dropdown
  	Then User validate the results count not modified but the sorting is modified
  	
  	

