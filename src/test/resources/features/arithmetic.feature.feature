Feature: Arithmetic operations

  Scenario: Add two numbers
    Given I have two numbers 5 and 7
    When I add the numbers
    Then the result should be 12

  Scenario: Subtract two numbers
    Given I have two numbers 10 and 3
    When I subtract the numbers
    Then the result should be 7
