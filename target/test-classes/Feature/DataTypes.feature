@Tag4
Feature: Type Data types in api demos app

  Scenario: testing Writing data types functionality
    Given user is on the homepage
    When user hits content
    Then user is navigated to content page
    When next user hits clipboard
    Then user is navigated to clipboard page
    When user hits Data Types
    Then user is navigated to Data Type Page
    And user starts writing the Data Type
    Then the text started typing successfully and the test case is validated!