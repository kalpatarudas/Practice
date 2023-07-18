
Feature: Login Feature
Scenario:Login Test Scenario
Given User is in login page
  When User enters username
  And User enters password
  Then user should be able to login successfully

  Scenario Outline:

    Given User is in login page
    When User enters specific <Username>
    And User enters Specific <password>
    Then user should be able to login successfully
    Examples:
    |Username|    |password|
    |Amarjeet|    |kadali|
