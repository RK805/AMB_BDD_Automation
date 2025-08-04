Feature:login functionality for Corsoh Ecommerce website


  Background:
    Given the user is on the Corsoh Ecommerce website

  Scenario Outline: Successful login with valid credentials
    Given the user enters username "<username>"
    And the user enters password "<password>"
    When the user clicks the login button
    Then the user should be redirected to the dashboard

    Examples:
      | username |  | password      |
      | testuser |  | securePass123 |