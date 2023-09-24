Feature: Login Functionality
  As a user I want to be able to login with my valid credentials so I can reach my info

#@Smoke
  Scenario: Login with valid username and password
    Given Navigate to Campus
    When   Enter username and password
    And  Click on login button
    Then  User should be logged in successfully