Feature: Country Functionality
  As a user I want to be able to create, delete and update countries so that I can update the country list.

  Scenario: Create a country
    Given Navigate to Campus
    When   Enter username and password
    And  Click on login button
    And Navigate to Country page
    When Create a new country
    Then Success message should be displayed

  Scenario: Delete a country
    Given Navigate to Campus
    And Enter username and password
    And Click on login button
    And Navigate to Country page
    When Delete a country
    Then Success message should be displayed

  Scenario:
    Given Navigate to Campus
    And Enter username and password
    And Navigate to Country page
    And Click on add button
    And Enter "Batch 8" as country name and "BTC" as country code
    When Click on save button
    Then Success message should be displayed