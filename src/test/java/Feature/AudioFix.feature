@Tag2
Feature: equalize Audio in api demos app

  Scenario: testing equalizing audio functionality
    Given user is on the apphomepage
    When user click media
    Then user is navigated to media page
    When next user hits audioFx
    Then user is navigated to audioFx page
    And user starts equalizing audio from resources
    Then the audio started successfully and the test case is validated!