@Pintu
Feature: Login


  Scenario: Verify user can login with valid data
    Given user input email with "Yudhi.urban@gmail.com"
    And user input password with "123456"
    When user click login button
    Then user can see home page

  Scenario: Verify user cannot login with invalid data
    Given user input email with "Yudhi.urban@gmail.com"
    And user input password with "12345"
    When user click login button
    Then user can see error message

  Scenario: Verify user cannot login with Empty data
    Given user input email with ""
    And user input password with ""
    When user click login button
    Then user can see error message email

  Scenario: Verify user cannot login with Email valid and password invalid
    Given user input email with "Yudhi.urban@gmail.com"
    And user input password with ""
    When user click login button
    Then user can see error message email