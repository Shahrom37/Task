

  Feature: Log out Test

    Scenario: Log out
      Given I login Into The TN Bank
      When I amm On The Home Page
      Then I should See Log Out Button is Displayed
      And I click Log out Button
      Then I should Log out Button
