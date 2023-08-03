Feature: Country Functionality
  As a user I want to be able to create, delete and update countries so that I can update the country list.

  Scenario: Login with valid username and password
    Given Navigate to Campus
    When   Enter username and password
    And  Click on login button
    And Navigate to Country page
    When Create a new country
    Then Success message should be displayed