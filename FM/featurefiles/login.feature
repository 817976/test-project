Feature: UrbanLadder login

  Scenario: Login using valid credentials
    Given user is navigating to the UrbanLadder url
    And go to login and click
    When email and password are entered
    And click on login button
    Then dislpay the user home page
    And close the application
