Feature: Testing the Login functionality
Background: Navigation for the website
  Scenario:
    Given User navigates to the NHS website
    When  User is successfully logged in
    Then User should be able to see 3 cards with numbers the information of Patients with rooms
    And  waiting Free rooms
    Then User validates the Free rooms Patients with rooms waiting free rooms