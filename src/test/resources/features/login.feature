@Regression
Feature: As a user, I should be able to login with correct credentials to different accounts.
and dashboard should be displayed.
Accounts are: librarian, student, admin

Background: user is expected to be on the login page at first
Given coming from Background user is on the login page

  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    And User Click the login button
    Then user should see the dashboard

    Scenario: Login as student
      When user enters student username
      And user enters student password
      And User Click the login button
      Then user should see the dashboard

  Scenario: Login as Admin
    When user enters Admin username
    And user enters Admin password
    And User Click the login button
    Then user should see the dashboard