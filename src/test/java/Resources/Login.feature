

  Feature: Login.Test
    @smoke
      Scenario: Login Test
      Given I Navigate to Login Page
      When I Enter Username as "admin"
      And I Enter Password as "password"
      And I click Login Button
      Then I should Login Successfully