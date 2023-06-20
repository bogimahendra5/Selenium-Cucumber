Feature: Logout Success
  Scenario: Logout success
    Given In any webpage
    And Go to side menu
    When Click button Logout
    Then Should success logout and redirected to loginpage
