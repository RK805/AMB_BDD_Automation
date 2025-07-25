Feature: Shopping Cart Functionality

  Background:
    Given the user is on the homepage

  Scenario: User adds a product to the cart
    Given the user is on the homepage
    And the user selects a random product from the list
    When the user clicks on the "Add to Cart" button
    Then the product should be added to the cart
    And the cart icon should display the correct item count
    And confirmation message "Product added to cart" should be displayed

  Scenario: User views the cart
    Given the user has at least one item in the cart
    When the user clicks on the cart icon
    Then the cart page should display all added items
    And each item should show the product name, image, price, quantity, and subtotal

  Scenario Outline: User updates the quantity of a cart item
    Given the user has a product in the cart
    When the user updates the quantity of the product to "<quantity>"
    Then the quantity should be updated in the cart
    And the subtotal for the product should reflect the new quantity

    Examples:
      | quantity |
      | 2        |

  Scenario: User removes an item from the cart
    Given the user has multiple items in the cart
    When the user clicks on the "Remove" button for a product
    Then that product should be removed from the cart
    And the cart total should be updated accordingly

  Scenario: User clears the entire cart
    Given the user has items in the cart
    When the user clicks on "Clear Cart"
    Then all items should be removed
    And a message should display "Your cart is empty"