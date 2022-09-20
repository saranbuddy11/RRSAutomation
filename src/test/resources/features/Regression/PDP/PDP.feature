#Author: R.Karthik
@PDP_Full @RegressionSuite_Full
Feature: PDP Regression Scripts

  @PDP_001
  Scenario: Verify Users direction to PDP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page on clicking of Product

  @PDP_002
  Scenario: Verify Bread crumb in the PDP page
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify Bread Crumb and its navigation

  @PDP_003
  Scenario: Verify the Product name displayed in PDP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify Product name is Displayed or not

  @PDP_004
  Scenario: Verify whether Color SKUs are sorted alphabetically or not
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify color SKUs are sorted alphabetically or not
      | alt |

  @PDP_005
  Scenario: Verify whether Size SKUs are orderly sorted  or not
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    And Verify size SKUs are sorted orderly or not
      | aria-label |

  @PDP_006
  Scenario: Verify Review star and review links in PDP
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page of selecting particular item
      | Women's ASICS GEL-Nimbus 24 |
    And Verify number of reviews and star ratings
      | reviews |
    And Verify navigation when clicks on Reviews
      | Review Snapshot |

  @PDP_007
  Scenario: Verify Review counts displayed in the PDP are matching from PLP or not
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page with review count
      | Women's ASICS GEL-Nimbus 24 |
    And Verify number of reviews count
      | reviews |

  @PDP_008
  Scenario: Verify Outlet Products in PDP
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41654" and click on search button
    Then Verify the product and its prices
      | Women's KORSA Performer Ventilated Crop Bra | SALE | $ | When you join our VIP Family |

  @PDP_009
  Scenario: Verify Product displayed with Colour, Size and Width
    Given User Lauch RRS application and navigate to home page
    And User Search for a product with some keywords "39643" and click on search button
    #Then Assert user is directed to appropriate PLP page for the keyword used
    #And Verify User Navigation to PDP page
    And Verify SKUs of the product
      | Color | Size | Width |

  @PDP_010
  Scenario: Verify thumbnail images and vidoes in PDP page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page of selecting particular item
      | Women's ASICS GEL-Nimbus 24 |
    And Verify thumbnail images and videos

  @PDP_011
  Scenario: Verify product images in PDP
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41654" and click on search button
    Then Verify Product image
      | aria-label | Previous | Next | class | hidden |

  @PDP_012
  Scenario: Verify add to Cart from PDP
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41654" and click on search button
    Then Verify Add to Cart Button
      | M | 5 | aria-label | Dark Aqua Sprint | 1 | 2 |

  @PDP_013
  Scenario: Verify Klarna text with learn more link
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41654" and click on search button
    Then Verify Klarna text with learn more link

  @PDP_014
  Scenario: Verify expert review under product description
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "39642" and click on search button
    Then Verify product description and expert review
      | SHOE CATEGORY What is this? | CUSHION LEVEL Learn More |

  @PDP_015
  Scenario: Verify Review Snapshot section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41090" and click on search button
    Then Verify Review Snapshot Section
      | 217 Reviews | 4.5 | aria-label | 88% |

  @PDP_016
  Scenario: Verify Write Review CTA button response
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "41090" and click on search button
    Then Verify Write Review CTA Button
      | Write a Review | write | review |

  @PDP_017
  Scenario Outline: Verify Outfit Your section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords <ProductID> and click on search button.
    Then Verify Outfit Your Run Section <Count>
      | OUTFIT YOUR RUN |

    Examples: 
      | ProductID | Count |
      |     39591 |    21 |
      |     41679 |    12 |

  @PDP_018
  Scenario: Verify You may also like section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "39642" and click on search button
    Then Verify You may also like section
      | MEN'S BROOKS GHOST 14 | YOU MAY ALSO LIKE | 12 | Men's Brooks |
