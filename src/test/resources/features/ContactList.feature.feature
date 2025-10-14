@ContactList
Feature: Register new user

  Scenario: Successful registration
    Given user opens contact list page "https://thinking-tester-contact-list.herokuapp.com/"
    When user creates an account with email "test123@example.com" and password "123456"
    Then the account should be created successfully
