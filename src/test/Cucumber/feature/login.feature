Feature: Gmail Testing scenarios.

  Scenario: User login to GMail with valid credentials.

    Given Navigate to Login Page.
    When provide valid Username and Password.
    Then Validate the user is logged in.