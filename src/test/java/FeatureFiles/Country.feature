#Go to Campus
#log in
#Enter username and password
#Click on Set up
#Click on Parameter
#Click on countries
#Click on add button
#Fill the form
#Click on save button
#Assert that you see success message

Feature: Country Functionality
  As a user I want to be able to create, delete and update countries
  so that I can update the country list

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on login button
    And Navigate to Country page
@Smoke
  Scenario: Create a new country
#    Given Navigate to Campus
#    And Enter username and password
#    And Click on Login Button
#    And Navigate to Country page
    When Create a new country
    Then Success message should be displayed
@Smoke
  Scenario: Delete a country
#    Given Navigate to Campus
#    And Enter username and password
#    And Click on Login Button
#    And Navigate to Country page
    When Delete a country
    Then Success message should be displayed
@Regression
  Scenario: Create a country with parameters
#      Given Navigate to Campus
#      And Enter username and password
#      And Click on Login Button
#      And Navigate to Country page
    And Click on add button
    And Enter "Batch 8" as country name and "BTC" as country code
    When Click on save button
    Then Success message should be displayed

      #TODO Update the country you created
@Regression
  Scenario: Delete a country
#    Given Navigate to Campus
#    And Enter username and password
#    And Click on Login Button
#    And Navigate to Country page
    When Delete a country
    Then Success message should be displayed