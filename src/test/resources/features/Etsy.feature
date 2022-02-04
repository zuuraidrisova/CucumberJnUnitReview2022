@etsy
Feature: Etsy Title Verification
  As a user I should be able to see the title when i open etsy


#TC#51: Etsy Title Verification
#User is on https://www.etsy.com
#User sees title is as expected.
#Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone
#Note: Follow POM

  Background:
    Given User is on the etsy page

  Scenario: Etsy Title Verification
    Then User should see title as expected


  #TC#52: Etsy Search Functionality Title Verification (without parameterization)
  #User is on https://www.etsy.com
  #User types Wooden Spoon in the search box
  #User clicks search button
  #User sees Wooden Spoon is in the title
  #Note: Follow POM


  Scenario: Etsy Search Functionality Title Verification Without Prmtrzn
    When  User types wooden spoon in the search box
    And User clicks search button
    Then User sees wooden spoon is in the title


    #TC#53: Etsy Search Functionality Title Verification (with parameterization)
    #User is on https://www.etsy.com
    #User types Wooden Spoon in the search box
    #User clicks search button
    #User sees Wooden Spoon is in the title
    #Note: Follow POM


  Scenario: Etsy Search Functionality Title Verification With Prmtrzn
    When  User types "Wooden spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon" is in the title
