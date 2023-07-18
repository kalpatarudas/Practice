
@smoke @regression
Feature: Gmail login feature
  Scenario: Login to Gmail with valid Userid and Password
    Given : User is in Gmail Homepage
    When : User enters valid "UserName"
    And : User enters valid "Password" in password
    And : User clicks on "Login" Button
    Then : The user should be navigated to Inbox page