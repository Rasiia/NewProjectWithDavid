Feature:
  Background:
    Scenario:
      Given user navigates to the NHS website
      When  user enters username and password
      When  User is successfully logged IN
      Then user should be able add a new patient to the NHS system
      And  user should see dashboard and with new patient is registered under patient waiting list
     Then user should use the search bar to search patient with their first name,last name,full name
     And  user should search bar to see patients with their hospital number




