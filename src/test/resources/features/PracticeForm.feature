Feature: Form Submission

  Background:
    Given User is on the practice form page

  @Form @Smoke
  Scenario: Successful submission with valid credentials
    When User enters valid data into all required fields
    And User selects a gender and hobby
    And User submits the form
    Then User should see a confirmation message

  Scenario: Form cannot be submitted with missing required fields
    When User leaves required fields empty
    And User submits the form
    Then User should not be able to submit the form