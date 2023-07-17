@tag
Feature: Invalid Cred Test
  I want to use this template for to check Admin Login with Invalid Inputs


  @tag2
  Scenario Outline: check Admin Login with Invalid Inputs
    Given I open browser with the url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When I enter user_name as "<username>"
    And I enter password as "<password>"
    And I click submit
    Then I should see error msg
    
    

    Examples: 
      | username|password|
      | Admin | abc | 
      | Add   | Qedge123!@#| 
      | abc   | xyz |