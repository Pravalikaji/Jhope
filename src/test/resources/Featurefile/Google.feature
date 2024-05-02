Feature: Test For google application

  Scenario: Verify Title of google page
    Given Browser should open and application should launch
    When User Captures Title of google page
    Then Expected and Actual Title Should Match
