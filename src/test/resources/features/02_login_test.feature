Feature: Login Feature

  @Login
  Scenario: Happy Path
    Given user is on the signin page
    When user enters valid username
    And user enters valid password
    And user click on submit button
    Then user validates the signin
    And close browser

  @InvalidUsername
  Scenario: Wrong username
    Given user is on the signin page
    When user enters invalid username
    And user enters valid password
    And user click on submit button
    Then assert alert message
    And close browser

  @InvalidPassword
  Scenario: Wrong password
    Given user is on the signin page
    When user enters valid username
    And user enters invalid password
    And user click on submit button
    Then assert alert message
    And close browser

  @InvalidPassword
  Scenario: Wrong password
    Given user is on the signin page
    And user enters valid password
    And user click on submit button
    Then assert empty username message
    And close browser

