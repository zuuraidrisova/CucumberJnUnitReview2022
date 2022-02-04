@scenarioOutline
Feature: Search
  Agile Story: As a user, I should be able to search when I am on search page.

  Background: User should be at google search page
    Given User is on the search page

    Scenario Outline: Google Title Verification After Search
      When User types "<searchValue>" into search box
      Then User should see "<expectedValue>" in the title

      Examples: Search values i want to google
        | searchValue         | expectedValue       |
        | Alan Delon          | Alan Delon          |
        | Zuura Idrisova      | Zuura Idrisova      |
        | Cholpon Shabolotova | Cholpon Shabolotova |
        | Barack Abama        | Barack Abama        |
        | Kim Kardashian      | Kim Kardashian      |
        | Thomas Jefferson    | Thomas Jefferson    |


