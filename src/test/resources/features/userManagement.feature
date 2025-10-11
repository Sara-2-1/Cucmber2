@user_management
Feature: User Management Operations

  Background:
    Given the browser is open
    And I am on the user management page

  @smoke @create
  Scenario: Create a new user
    When I create a new user
    Then a success message should be displayed

  @update
  Scenario: Update existing user
    When I update user information
    Then a confirmation message should be displayed

  @delete @critical
  Scenario: Delete a user
    When I delete a user
    Then a deletion message should be displayed

  @smoke @search
  Scenario: Search for a user
    When I search for a user
    Then the user information should be shown
