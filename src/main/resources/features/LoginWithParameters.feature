Feature: Login with parameters
@run
  Scenario: Login as librarian 11
    Given I am on the login page
When I login using "librarian21@library" and "aZ849tSZ"
    And click the sign in button
    Then dashboard should be displayed


  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username
    And click the sign in button
    Then dashboard should be displayed