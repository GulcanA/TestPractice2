Feature: US1001  Amazon Search Feature

   @search @smoke
  Scenario Outline: TC01 User should be able to search successfully
    Given User navigates to the url
    And User enters "<item>" into the searchbox
    Then User gets the results including "<itemu>"
    Examples:
      |item |
      | book   |
      | phone  |
      | pencil |


