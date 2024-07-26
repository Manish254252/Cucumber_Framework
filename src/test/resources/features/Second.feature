Feature: Admin User Verification

  Scenario: Verify at least one admin user is present in user list
    Given the user is on the Login Page
    When the user logs in with valid credentials
    And the user navigates to the Admin page
    And the user selects "Admin" from the user role dropdown
    And the user clicks the search button
    Then the user list should have at least one admin user








