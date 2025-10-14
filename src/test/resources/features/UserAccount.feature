@UserAccount
Feature:User Account
  Scenario: Add a New Contact
    Given user visits "https://thinking-tester-contact-list.herokuapp.com/"
    When user types email "sas@gmail.com"
    And user enters password "ss@8080"
    And user clicks on "submit" button
    And user clicks on "Add a New Contact" button
    And user enters first name "ssl"
    And user enters last name "sh"
    And user clicks on "submit" button
    Then assert that "You have successfully Added" is displayed in the contact list
