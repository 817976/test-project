Feature: search in UrbanLadder

Scenario: Login using valid credentials
    Given user is navigating to the UrbanLadder url
    And go to login and click
    When email and password are entered
    And click on login button
    Then dislpay the user home page
    And close the application

  Scenario: Searching items in site
Given user naviagte to url  
    Given user is navigated to search box 
    When item is entered
    Then click search symbol
    And go to page