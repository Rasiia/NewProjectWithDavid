Feature:

  Scenario:
    Given user navigates to the NHS website
    When  user enters username and password
    When  User is successfully logged IN
    Then user should see in dashboard page you can search rooms with name
    And  user should able to see search patients in room with their number or name
    Then validate all search functions are working for rooms and patients in room

