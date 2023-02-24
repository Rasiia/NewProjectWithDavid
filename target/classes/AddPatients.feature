Feature:
  Background:
    Given user navigates to the "http://www.techtorialacademy.link/"

    Scenario:
      Given User navigates to the NHS website
      When User enters username and password
      When  User is successfully logged in
      When user click the add patient button on the left side i the page
      And  user provides the information First Name,'Last Name,'Hospital no','Date of birth','Sex','Male' ,' Female'
      And  user clicks the add patient button
      Then user should be able to see patient is added to the main page under Patients waiting



