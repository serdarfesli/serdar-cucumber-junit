Feature: Web Table user order feature

  @wip
  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity "2"
    And user enters costumer name "Münir Cihan"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user enters credit card type "American Express"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Münir Cihan" in first row of the web table
@wip
  Scenario Outline: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<ProductType>"
    And user enters quantity "<Quantity>"
    And user enters costumer name "<Name>"
    And user enters street "<Street>"
    And user enters city "<City>"
    And user enters state "<State>"
    And user enters zipcode "<Zip>"
    And user enters credit card type "<CardType>"
    And user enters credit card number "<CardNumber>"
    And user enters expiry date "<ExpiryDate>"
    And user enters process order button
    Then user should see "<Name>" in first row of the web table
    Examples: Famous female scientists
      | ProductType | Quantity | Name        | Street            | City   | State   | Zip   | CardType         | CardNumber       | ExpiryDate |
      | Familybea   | 2        | Münir Cihan | 221B Baker Street | London | England | 50505 | American Express | 1111222233334444 | 12/23      |