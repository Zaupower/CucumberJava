#Coments with "#"
Feature: feature to test Login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given User navigates to login page
    When User input <username> and <password> credentials
    And Click on login button
    Then User is redirected to the home page

    Examples: 
      | username   | password |
      | mail.2.com | um       |
      | mail.1.com | dois     |
