Feature: Data Table Example
@Smoke @Regression
  Scenario: Single Data Table
    Given Go to the WebPage
    And Fill the form with valid data
      | John            |
      | Snow            |
      | 2345 Winter St. |
      | 8563241256      |
    Then Save the form

                    # Data Table vs Scenario Outline
    # Data table sends all data to one step at once and runs the scenario only once
    # Scenario Outline sends the data one by one for each time and runs the entire scenario for all data sets

  Scenario: Multiple Data Tables
    Given Go to the WebPage
    And Fill the form with valid data
      | John            |
      | Snow            |
      | 2345 Winter St. |
      | 8563241256      |
    And Enter valid information
      | Name      | John             |
      | Last Name | Snow             |
      | Address   | 2356 Spring Ave. |
      | Phone     | 8654123658       |
    Then Save the form


    # We use Data Table if we need too many datas for one step.
    # Instead of writing them next to each other we can send them with Data Table
