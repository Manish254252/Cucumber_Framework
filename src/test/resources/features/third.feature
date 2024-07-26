Feature: Leave Application

  Scenario: Verify user can apply for leave
    Given the user is on the Login Page
    When the user logs in with valid credentials
    And the user navigates to the Leave page
    Then the Leave page should be loaded
    When the user clicks the apply Link
    And the user selects a leave type
    And the user enters the leave date from "2024-03-09" to "2024-06-09"
    And the user selects partial days as "All days"
    And the user selects duration as "Half day - Morning"
    And the user clicks the apply button
    Then the success message should be displayed
    When the user clicks on my leave
    Then the leave entry from "03 Sept 2024" to "05 Sept 2024" should be displayed

