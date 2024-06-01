#Author: Bharath
#Keywords Summary :
#Feature: Login feature
Feature: Login module related test cases

  Scenario Outline: Test valid login functionaity
    Given User opens the browser
    When User navigated to the Login page
    And User enters user name as '<username>' and password as '<password>'
    And Clicks on Login button
    Then the home page is displayed
    And close the browser
    
    Examples: 
      | username  | password |
      | bharathedu1 |     123456 |
      | bharathedu2 |     welcome1 |
