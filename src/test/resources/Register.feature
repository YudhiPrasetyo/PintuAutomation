@Pintu
Feature: Register

  Scenario: Verify user can register with valid data
    Given user click on create one on login page
    When user input full name with "Pintu" on register page
    When user input email with "pintu@gmail.com" on register page
    When user input password with "123456" on register page
    When user input confirm password  with "123456" on register page
    And user click button register on register page
    Then user is successfully registered

  Scenario: Verify user cannot register with same data
    Given user click on create one on login page
    When user input full name with "Pintu" on register page
    When user input email with "pintu@gmail.com" on register page
    When user input password with "123456" on register page
    When user input confirm password  with "123456" on register page
    And user click button register on register page
    Then user is successfully registered