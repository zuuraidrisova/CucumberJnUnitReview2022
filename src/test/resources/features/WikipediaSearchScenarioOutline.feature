@wikipediaWithScenarioOutline
Feature: Wikipedia Search Functionality

  Background:
    Given User is on Wikipedia home search page

  Scenario Outline:  Wikipedia Search Functionality Title Verification
    When User types "<searchValue>" in the wiki search box
    And   User clicks on the  wiki search button
    Then  User sees "<expectedValueInTitle>" is in the wikipedia title
    Then  User sees "<expectedValueInHeader>" is in the main header
    Then  User sees "<expectedValueInImage>" is in the image header

    Examples:
      | searchValue     | expectedValueInTitle | expectedValueInHeader | expectedValueInImage |
      | Steve Jobs      | Steve Jobs           | Steve Jobs            | Steve Jobs           |
      | John Travolta   | John Travolta        | John Travolta         | John Travolta        |
      | Albert Einstein | Albert Einstein      | Albert Einstein       | Albert Einstein      |
      | Keanu Reeves    | Keanu Reeves         | Keanu Reeves          | Keanu Reeves         |
      | Bruce Lee       | Bruce Lee            | Bruce Lee             | Bruce Lee            |
      | Dua Lipa        | Dua Lipa             | Dua Lipa              | Dua Lipa             |
      | Thomas Edison   | Thomas Edison        | Thomas Edison         | Thomas Edison        |
      | Sam Heughan     | Sam Heughan          | Sam Heughan           | Sam Heughan          |