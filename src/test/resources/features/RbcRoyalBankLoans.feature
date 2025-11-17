Feature: rbc Royal Bank Loans

  Background:
    Given the user is open the Home page

  Scenario: Investment personal loan process in Royal Bank
    Given the user navigate the mouse into the loans and click on the Personal loan option
    When user navigate to the Personal loan window page
    Then the user should see the Personal loan page
    And the user click on the Apply now button
    Then the user should see the Personal loan application page
    And the user should see the Personal loan application form
    And the user click on the Continue button
    Then the user should see the Personal loan application form with error message