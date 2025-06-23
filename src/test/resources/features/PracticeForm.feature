@Form @Smoke

  Scenario: Successful registration with valid credentials

  Given the user is on the practice form
  When the user enters First and Last name
  And the user chooses their gender and years of experience
  And the user picks a date
  And the user checks their professions
  And the user clicks a continent from the dropdown
  And the user uploads a file
  And the user clicks the submit button
  Then the user should be redirected to the homepage
  And a successful registration pop up should appear