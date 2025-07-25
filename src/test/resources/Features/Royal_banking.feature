Feature: Investment Performance Snapshot in Royal Bank in mutual funds

  Background:
    Given the user is open the Home page

  @Test
  Scenario Outline: Investment process in mutual funds
    Given the user navigate the mouse into the Investments and click on the Mutual funds option
    When user navigate the Mutual Funds window page
    And user click on the option Investment Performance Snapshot
    Then user navigate the Investment Performance Snapshot page
    And user Add fund to view performance <Investment> <contribution> <withdrawal>
    And user click on the View Fund performance
    Then user check the portfolio performance on Investment Performance Snapshot

    Examples:
      | Investment | contribution | withdrawal |
      | "500000"   | "5000"       | "1000"     |

#  Scenario Outline: Investment process in All Investment Tools & calculators
#    Given the user navigate the mouse into the Investments and click on the All Investment Tools and calculators option
#    When user navigate All Investment Tools & calculators page
#    And user click on the option RRSPInvestment Performance Snapshot
#    Then user navigate the RRSPInvestment Performance Snapshot page
#    And user Add fund to view Investment performance <Investment> <contribution> <withdrawal>
#    And user click on the View Fund performance
#    Then user check the portfolio performance on RRSPInvestment Performance Snapshot
#
#    Examples:
#      | Investment | contribution | withdrawal |
#      | "500000"   | "5000"       | "1000"     |
#
#  Scenario Outline: Investment process in All Investment Tools & calculators (Future value calculators)
#    Given the user navigate the mouse into the Investments and click on the All Investment Tools and calculators option
#    When user navigate the All Investment Tools & calculators window page
#    And user click on the option Future value calculators
#    Then user navigate the Future value calculators page
#    And user add the Future value calculators  <currentInvestment> <retaOfReturn> <yearsUnit>
#    And user click on the calculate
#    Then user check the Value of your investments Future value calculators
#
#    Examples:
#      | currentInvestment | retaOfReturn | yearsUnit |
#      | "600000"          | "10"         | "10"      |
#
#  Scenario Outline: Investment process in All Investment Tools & calculators (RBC Equity-Linked GICs Return Calculator)
#    Given the user navigate the mouse into the Investments and click on the All Investment Tools and calculators option
#    When user navigate the All Investment Tools & calculators window page
#    And user click on the option RBC Equity-Linked GICs Return Calculator
#    Then user navigate the RBC Equity-Linked GICs Return Calculator page
#    And user add the RBC Equity-Linked GICs Return Calculator  <investment>
#    And user click on the calculate RBC
#    Then user check the calculate RBC
#
#    Examples:
#      | investment |
#      | "500000"   |