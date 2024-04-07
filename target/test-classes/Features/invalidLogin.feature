Feature: Test the login page for invalid credentials

  @Smoke
  Scenario Outline: Login page validation for invalid credentials
    Given browser is opened
    And invalid user is on login page
    When invalid user enters wrong <username> and <password>
    And enter on submit button
    Then invalid username will be displayed

    Examples: 
      | username      | password    |
      | incorrectUser | Password123 |
