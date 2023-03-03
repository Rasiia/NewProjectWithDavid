Feature:
  Background:
  Scenario:
    Given User navigates to the NHS website
    When User enters username and password
    When  User is successfully logged in
    When User clicks the system setting the user should be able to add a new user
    And  User enters new username and password
    Then user can add user
    And user can see all information displayed on the dashboard page should not change after loggig in with new user

