Feature: US1002 User add data

   @dataTable @smoke
  Scenario Outline: User should be able to add data into the data table
    Given User navigates to the Editor Page
    Then User clicks New Button
    And User enters "<first_name>" "<last_name>" "<position>" "<office>" "<start_date>" "<salary>"
    And User clicks create button
    When User searchs her first name
    Then User see her name on the table

    Examples:
      | first_name | last_name | position | office   | start_date | salary |
      | Ali        | Kaya      | manager  | Istanbul | 05.02.2020 | 5000   |
      | Gulcan     | Doruk     | tester   | Berlin   | 10.09.2023 | 8000   |

