Feature: Login with parameters
  Scenario: Login as librarian 11
    Given I am on the login page
    And I entered the password "1872GG"
    When I enter username "Librarian11@library"
    And click the sign in button
    Then dashboard should be displayed


  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username
    And click the sign in button
    Then dashboard should be displayed