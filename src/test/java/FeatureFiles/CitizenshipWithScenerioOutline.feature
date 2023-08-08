Feature: Citizenship Functionality

  Background:
    Given Navigate to Campus
    And Enter username and password
    And Click on login button
    And Navigate to Citizenship page


  Scenario Outline: Create a Citizenship
    And Click on add button
    Then Enter "<CitizenshipName>" as citizenship name and "<CitizenshipShortName>" as short name
    When Click on save button
    Then Success message should be displayed
    Examples: Data for Create a Citizenship scenario
      |CitizenshipName|CitizenshipShortName|
      |USA1           |U1                  |
      |USA2           |U2                  |
      |USA3           |U3                  |
      |USA4           |U4                  |

    #TODO: Create Delete Citizenship scenario by using Scenario Outline and delete the citizenships you created in the first scenario

  Scenario Outline: Delete a Citizenship
    And Search for the citizenship with the name "<CitizenshipName>" and short name "<CitizenshipShortName>"
    When Delete Citizenship
    Then Success message should be displayed
    Examples: Data for Delete Citizenship scenario
      |CitizenshipName|CitizenshipShortName|
      |USA1           |U1                  |
      |USA2           |U2                  |
      |USA3           |U3                  |
      |USA4           |U4                  |

