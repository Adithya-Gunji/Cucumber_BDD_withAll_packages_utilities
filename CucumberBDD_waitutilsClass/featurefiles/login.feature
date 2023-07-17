@tag
Feature: Admin LoginTest
  I want to use this template for to check Admin login

  @tag1
  Scenario: Admin Login with valid inputs
    Given I open browser with the url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When I enter user_name as "Admin"
    And I enter password as "Qedge123!@#"
    And I click submit
    Then I should see Admin module
    When i close the browser 