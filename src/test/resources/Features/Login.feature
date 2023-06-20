Feature: Login Test SauceLabs
  Scenario: Login success
    Given Open web url
    And Input username "standard_user" and password "secret_sauce"
    When Click login button
    Then Should success login and redirected to homepage

  Scenario Outline: Failed Username Required
    Given Open web url
    And Input username "<username>" and password "<password>"
    When Click login button
    Then Showing error message username required
    Examples:
      |username|password|
      ||secret_sauce|

  Scenario Outline: Failed Password Required
    Given Open web url
    And Input username "<username>" and password "<password>"
    When Click login button
    Then Showing error message password required
    Examples:
      |username|password|
      |standard_user||

  Scenario Outline: Invalid Username or Password
    Given Open web url
    And Input username "<username>" and password "<password>"
    When Click login button
    Then Showing error message username and password not match
    Examples:
      |username|password|
      |user fail|pass fail|