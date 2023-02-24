Feature: Testing the Login functionality

  Scenario: Happy Path login to the website
    Given User navigates to the NHS website
    When User enters username and password
    Then User click Sign in button
    And User is successfully logged in
    Then User verifies the title is NHS Patient


  Scenario: Negative testing of login functionality
    Given User navigates to the NHS website
    When User enters username and invalid password
    And User click Sign in button
    Then User cannot login



  Scenario: Negative testing of login functionality by passing blank password
    Given User navigates to the NHS website
    When User enters username and blank password
    And User click Sign in button
    Then User cannot login and receives error message

  Scenario:
    Given User navigates to the NHS website
    And user is successfully logged in
    When user should be able to see 3 cards with numbers the information of Patients with rooms
    Then user able to see the headers with Information no, Patients with rooms,Room,Score
