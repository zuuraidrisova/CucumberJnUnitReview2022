@google
Feature: Search
  Agile Story: As a user, I should be able to search when I am on search page.

  #this is how u comment in feature file
  Background:
    Given User is on the search page

  Scenario: Google default title verification
    Then  User should see title is Google

  @search1
  Scenario: Google Title verification after search with prmtrzn
    When User types "apple" into search box
    Then User should see "apple" in the title

  @search2
  Scenario: Google Title verification after search without prmtrzn
    When User types apple into search box
    Then User should see apple in the title


   #wip means work in progress
  Scenario: Google search page -About- link title
    When  User should see About link
    And   User clicks to About link
    Then  User should see title Google - About Google, Our Culture & Company News

    #Verify that on the google search page footer contains 6 links


  #data tables example
  @wip
  Scenario: Verify Google Footer has 6 links
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search works |

