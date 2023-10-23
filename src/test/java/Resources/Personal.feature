
  Feature: Personal Loan Test
    Scenario: Personal
      Given I login Into The TN Bank
      When I am On the Home Page
      Then I should see Personal button is displayed
      And I click Personal Button
      And I should land on Personal Loan Application Form
      Then I should fill out this application form
      And After filling out and clicking submit I should see alert
      Then I accept the alert
