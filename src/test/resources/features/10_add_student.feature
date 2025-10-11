@AddStudent
Feature: Add Student

  @StudentPositive
  Scenario: Happy Path
    Given user visits "https://claruswaysda.github.io/addStudent.html"
    When user enters full name "John Doe"
    And user enters student id "j123"
    And user enters email "john@doe.com"
    And user enters course "PE"
    And user selects grade "B+"
    And user click on add student button
    Then assert that student is added


  @StudentNegative
  Scenario Outline: Negative inputs
    Given user visits "https://claruswaysda.github.io/addStudent.html"
    When user enters full name "<name>"
    And user enters student id "<id>"
    And user enters email "<email>"
    And user enters course "<course>"
    And user selects grade "<grade>"
    And user click on add student button
    Then assert that error message is displayed as "<error_message>"

    Examples:
      | name | id   | email          | course | grade | error_message              |
      |      | 123  | john@doe.com   | Math   | A     | This field is required     |
      | John |      | john@doe.com   | Math   | A     | This field is required     |
      | John | 123  |                | Math   | A     | This field is required     |
      | John | 123  | john@doe       | Math   | A     | Invalid email address      |
      | John | 123  | john@doe.com   |        | A     | This field is required     |
      | John | 123  | john@doe.com   | Math   |       | This field is required     |
