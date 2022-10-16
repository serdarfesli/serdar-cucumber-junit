Feature:As a user I should be able to search
  TC#4: Wikipedia Search Functionality Image Header Verification
  1. User is on Wikipedia home page
  2. User types Steve Jobs in the wiki search box
  3. User clicks wiki search button
  4. User sees Steve Jobs is in the image header
  Note: Follow POM

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header

  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<Name>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<Name>" is in the wiki title

    Examples:
      | Name       |
      | Steve Jobs |
      |            |
      |            |
      |            |
      |            |
      |            |
      |            |
      |            |
      |            |



