#Author: Bharath
#Keywords Summary :
#Feature: Login feature
Feature: Login module related test cases

  Background: 
    Given User opens the browser
    When User navigated to the Login page

  Scenario: Test valid login functionaity
    And User enters user name as 'bharathedu1' and password as '123456'
    And Clicks on Login button
    Then the home page is displayed
    And close the browser

  @tag2
  Scenario: Test invalid login functionaity
    And User enters user name as 'bharath' and password as 'kjslj'
    And Clicks on Login button
    Then error message is displayed
    And close the browser
