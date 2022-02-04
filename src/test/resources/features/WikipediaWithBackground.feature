@wikipediaWithBackgroundExample
Feature: Wikipedia Search Functionality


  Background:
    Given User is on Wikipedia home page with BackGround Example

  Scenario:  Wikipedia Search Functionality Title Verification
    When User types Steve Jobs in the wiki search box with BackGround Example
    And   User clicks wiki search button with BackGround Example
    Then  User sees Steve Jobs is in the wiki title with BackGround Example


  Scenario: Wikipedia Search Functionality Header Verification
    When User types Steve Jobs in the wiki search box with BackGround Example
    And   User clicks wiki search button with BackGround Example
    Then   User should see Steve Jobs is in the main header with BackGround Example


  Scenario: Wikipedia Search Functionality Image Header Verification
    When User types Steve Jobs in the wiki search box with BackGround Example
    And   User clicks wiki search button with BackGround Example
    Then   User sees Steve Jobs is in the image header with BackGround Example