#Author: R.Karthik
@Cart_Full @RegressionSuite_Full
Feature: Cart Regression Scripts

  @Cart_001
  Scenario: Verify users direction to Cart page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on View Cart button
    And Verify View Cart Page "cart"

  @Cart_002
  Scenario: Verify the text displayed in 20% banner
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on View Cart button
    And Verify View Cart Page "cart" and banner

  @Cart_003
  Scenario: Verify Join for $1.99 CTA button in 20% banner
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | MMedium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And User Click on View Cart button
    And Verify View Cart Page and CTA button for VIP Membership
      | cart | Join for $1.99 |

  @Cart_004
  Scenario: Verfiy My Cart with total number of items in Cart
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page with number of Items "cart"

  @Cart_005
  Scenario: Verify the product image, SKU id, Color, Size, Width, Shipping option/ Pickup at store, Inventory message, MSRP and VIP price in Cart page
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and its content "cart"

  @Cart_006
  Scenario: Verify Product name and Click functionality
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and product name with its functionality "cart"

  @Cart_007
  Scenario: Verify the Option to increase and decrease quantity
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Quantity option "cart"

  @Cart_008
  Scenario: Verify Join VIP and Get this Price link and its Functionality
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Join VIP Link "cart"

  @Cart_009
  Scenario: Verify Remove text and its Functionality
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Remove Functionality "cart" "Your shopping cart is empty"

  @Cart_010
  Scenario: Verify Order Subtotal under Order Summary section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Order Subtotal "cart"

  @Cart_011
  Scenario: Verify the Checkout button response
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify View Cart Page and Checkout button response
      | cart | checkout |

  @Cart_012
  Scenario: Verify Login and Checkout button response
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Login and Checkout button response
      | cart | Login & Checkout | MY ACCOUNT |

  @Cart_013
  Scenario: Verify checkout with Paypal and its response
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Checkout with Paypal button response
      | cart | Checkout | paypal |

  @Cart_014
  Scenario: Verify Top picks for you section with recommended or Personalized products
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Top Picks for you section
      | cart | KORSA | 24 |

  @Cart_015
  Scenario: Verify the functionality and the products under Top picks for you section should have the Product name, Review Stars, MSRP Price, VIP Price and Swatch colors
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Top Picks for you section
      | cart | KORSA | 24 |
    And Verify Functionality of Product and its content "product"

  @Cart_016
  Scenario: Verify the VIP Price with Your VIP Price Text
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify VIP Price
      | cart | Your VIP Price | $ |

  @Cart_017
  Scenario: Verify VIP Savings under Order summary section
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify VIP Price
      | cart | Your VIP Price | $ |
    And Verify VIP savings
      | VIP Savings | - |

  @Cart_018
  Scenario: Verify Estimated Total under Order Summary section when the user is a VIP member
    Given User Land on the RRS home page after login with VIP user
      | testcucumbervip@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify VIP Price when user is VIP member
      | cart | Your VIP Price | $ |
    And Verify Estimated Total
      | Est. Total | $ |
    Then User logout of the application

  @Cart_019
  Scenario: Verify Whether the rewards cash earned is displayed or not
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify VIP Price
      | cart | Your VIP Price | $ |
    And Verify rewards cash
      | VIP Rewards Cash! | $ |

  @Cart_020
  Scenario: Verify Save for later text and its Functionality
    Given User Land on the RRS home page after login with VIP user
      | testcucumbervip@gmail.com | 123456 |
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Save for later and its functionality
      | cart | Save for Later | Your shopping cart is empty | 0 |
    Then User logout of the application

  @Cart_021
  Scenario: Verify checkout with Klarna and its response
    Given User Lauch RRS application and navigate to home page
    When User Search for a product with some keywords "WOMEN ASICS" and click on search button
    Then Assert user is directed to appropriate PLP page for the keyword used
    And Verify User Navigation to PDP page
    Then Verify Add to Cart Popup
      | Medium (Normal) | 7 | aria-label | Black/White | 1 | 2 |
    And Verify Checkout with Klarna button response
      | cart | Express Checkout | Klarna. | aria-label |
