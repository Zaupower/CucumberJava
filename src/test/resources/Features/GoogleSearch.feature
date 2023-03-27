Feature: Search words on Google.com

  Scenario: Search tech news on Google
    Given Open Google page
    And Search "Tech News"
    When Click on Search button
    Then The User is redirected to search results
