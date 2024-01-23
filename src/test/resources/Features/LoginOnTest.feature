Feature: Test Login Functionality
@smoke
  Scenario Outline: Check login is sucessfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    Then user is navigated to home page

    Examples: 
      | username | password |
      | mrojas   | Welcome1 |
      #| aca      | Welcome1 |

@smoke @regression
  Scenario Outline: Check login is sucessfull with InValid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    Then user unable to navigate home page

    Examples: 
      | username | password   |
      | mrojas   | Welcome123 |
@important
Scenario: Sample-1
Given
When
Then
@smoke
Scenario: Sample-2
Given
When
Then
