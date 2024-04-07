Feature: Test the login page

  Scenario Outline: Login page validation
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And enter on click button
    Then user is navigated to homepage
    
    Examples:
    | username | password |
    | student | Password123 |
#		| incorrectUser | Password123 |