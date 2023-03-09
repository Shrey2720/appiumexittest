@Tag1
Feature: play media in api demos app

  Scenario: playing audio from resources
    Given user is on the app homepage
    When user hits media
    Then user is navigated to next page
    When next user hits media player
    Then user is navigated to media player page
    And user hits play audio from resources
    Then the audio started playing successfully and the test case is validated!