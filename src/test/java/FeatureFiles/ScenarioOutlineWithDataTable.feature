Feature: Scenario Outline: with Data Table
  Scenario Outline: Scenario 1
    Given Step One
    |Step1|<Round Value1>|
    When Step Two
    And  Step Three
    |Step3|<Round Value2>|
    Then Step Four
    Examples:
      | Round Value1     | Round Value2   |
      | Round 1 Value 1  | Round1 Value 2 |
      | Round 2 Value 1  | Round2 Value 2 |
      | Round 3 Value 1  | Round3 Value 2 |
      | Round 4 Value 1  | Round4 Value 2 |