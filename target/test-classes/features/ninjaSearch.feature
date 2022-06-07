Feature: ninja tutorial

  Scenario: TC01 compare names displaying&cartlist

    Given navigate to tutorials ninja
    Then click on Phones & PDAs
    And get the brandName of phones
    And click on add to button for all elements
    And click on black total added cart button
    And get the names of list from the cart
    And compare the names from displaying list and cart list
    And close driver

