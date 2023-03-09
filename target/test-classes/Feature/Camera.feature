@Tag3
Feature: open camera in api demos app

  Scenario: opening cameraview from resources
    Given user is on app homepage
    When user hits graphics
    Then user is navigated to the next page
    When next user hits camera preview
    Then the camera preview started successfully and the test case is validated!