Feature: Login feature


  Scenario: user login with correct credentials.
    Given Open a chrome browser and Go to "https://web-table-2.cydeo.com/login"
    When Enter username "Test"
    And Enter password: "Tester"
    And User Click login button
    Then URL should end with "orders"


  Scenario Outline: user login with correct credentials.
    Given Open a chrome browser and Go to "https://web-table-2.cydeo.com/login"
    When Enter username "<Username>"
    And Enter password: "<Password>"
    And User Click login button
    Then URL should end with "orders"

    Examples:
      | Username | Password |
      | Test     | Tester   |


  Scenario: User should be able to see all 12 months in   months   dropdown
    Given Open a chrome browser and Go to "https://web-table-2.cydeo.com/login"
    When User enters below credentials
      | username | Test |
      | password | Tester |
    Then URL should end with "orders"