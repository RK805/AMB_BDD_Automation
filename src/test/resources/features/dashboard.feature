Feature: User Dashboard

  Background:
    Given the user is logged in

  Scenario: User interacts with the navigation menu bar
    Then the navigation menu should display the following links:
      | Home            |
      | Categories      |
      | Products        |
      | Profile         |
      | Contact         |
    When the user clicks on the "Categories" menu
    Then the categories section should display the following sections:
      | Healthcare Devices |
      | Orthopaedics       |
      | Sports Items       |
      | Cosmetics          |
      | Rehabilitation     |
      | Garments           |
      | General Items      |

  Scenario: User searches for a product
    Given the user is on the dashboard
    When the user enters "healthcare" in the search bar
    And clicks the search button
    Then the search results should display products related to "healthcare"
    And each product should show the name, image, price, and availability status

  Scenario Outline: User searches for product and add to cart
    Given the user is on the dashboard
    When the user enters "<search_term>" in the search bar
    And clicks the search button
    Then the search results should display products related to "<search_term>"
    And each product should show the name, image, price, and availability status
    When the user clicks on the "Add to Cart" button for a product
    Then the product should be added to the cart "<search_term>"
    And a confirmation message "Product added to cart" should be displayed

    Examples:
      | search_term   |
      | healthcare    |
      | orthopaedics  |
      | cosmetics     |
      | garments      |