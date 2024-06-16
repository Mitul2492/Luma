Feature: Gmail Login

  Scenario: Successful login with valid credentials
    Given User is on the Gmail login page
    When User enters a valid email address
    And User clicks on the "Next" button
    And User enters a valid password
    And User clicks on the "Next" button
    Then User should be redirected to the Gmail inbox
