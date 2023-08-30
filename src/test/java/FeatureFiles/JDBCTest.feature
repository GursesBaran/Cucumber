Feature: Database Testing for States Function
  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on login button

    Scenario: States testing with JDBC
      Given Navigate to States page
      When Send the query "select name from states"
      Then Check if they match with the names on the UI