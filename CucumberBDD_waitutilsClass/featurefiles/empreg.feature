@tag
Feature: New emp registration
  I want to use this template for to Register new employee

  @tag1
  Scenario: new emp registration
    Given I open browser with the url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When I enter user_name as "Admin"
    And I enter password as "Qedge123!@#"
    And I click submit
    Then I should see Admin module
    When I enter f_name as "Rock"
    And I enter l_name as "johnson"
    And I click save 
    Then I should see empreg Successfully
    When i close the browser 