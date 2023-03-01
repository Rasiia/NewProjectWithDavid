Feature:

  Background:
  Scenario:
    Given User navigates to the NHS website
    When User enters username and password
    When  User is successfully logged in
    When User clicks the system setting the user should be able to add the room with the room name
    And  all the diseases from the system will be displayed in a table by default order of room name
    Then the user will be able to delete the created diseases

