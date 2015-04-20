
Feature: Admin login for orangeHrm website
  As a Admin
  I want to login
  so that I can view dash board

   Scenario: Admin login with valid credentials

    Given Admin is in login page
    When admin sign in with the username "admin"
    And admin sign in with password "Insoft12"
    Then admin should be logged in

  Scenario Outline: Admin Should not be logged in with invalid Credentials
      Given Admin is in login page
      When admin enters username as'<username>'
      And  admin enters password as '<password>'
      Then admin should not be logged in

      Examples:
      |username|password|message|
      |||Enter UserName and Password|
      |admin|Insoft123|Invalis password|
      |admin12|Insoft12|Invalid User|

