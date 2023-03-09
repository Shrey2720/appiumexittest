@Tag5
Feature: text to speech in api demos app

  Scenario: testing text to speech functionality
    Given the app is open
    When user hits app options
    Then user is navigated to app page
    When next user swipe down
    And clicks text to speech
    Then the fuctionaltity starts working and is validated