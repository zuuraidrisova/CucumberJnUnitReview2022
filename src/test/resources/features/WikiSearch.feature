@wikipedia
Feature: Wikipedia Search Functionality

  #TC#25: Wikipedia Search Functionality Title Verification
  #1. User is on Wikipedia home page
  #2. User types Steve Jobs in the wiki search box
  #3. User clicks wiki search button
  #4. User sees Steve Jobs is in the wiki title
  #Note: Follow POM

  @wiki25
  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When  User types Steve Jobs in the wiki search box
    And   User clicks wiki search button
    Then  User sees Steve Jobs is in the wiki title


#    /*
#TC#26: Wikipedia Search Functionality Header Verification
#1. User is on Wikipedia home page
#2. User types Steve Jobs in the wiki search box
#3. User clicks wiki search button
#4. User sees Steve Jobs is in the main header
#Note: Follow POM
#*/

  @wiki26
  Scenario: Wikipedia Search Functionality Header Verification
    Given  User is on the Wikipedia home page
    When   User types Steve Jobs in the wiki searchBox
    And    User clicks on wiki search button
    Then   User should see Steve Jobs is in the main header



    #    /*
    #TC#27: Wikipedia Search Functionality Image Header Verification
    #1. User is on Wikipedia home page
    #2. User types Steve Jobs in the wiki search box
    #3. User clicks wiki search button
    #4. User sees Steve Jobs is in the image header
    #Note: Follow POM
    #     */

  @wiki27
  Scenario: Wikipedia Search Functionality Image Header Verification
    Given  User is on Wikipedia home Page
    When   User types Steve Jobs in the wikipedia search box
    And    User clicks on wikipedia search button
    Then   User sees Steve Jobs is in the image header
