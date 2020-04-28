@show_records @smoke @regression @lib-7031 @today
Feature: User group dropdown functionality

  Background:
    Given I login as a librarian
    And I navigate to users page


  Scenario: User group default values User Management
    Then User group default value should be "All"
    And show records should have following options:
      | ALL       |
      | Librarian |
      | Students  |

  Scenario: User group Librarian User Management
    When I select User group "Librarian"
    And I select Show 50 records
    Then Groups columns in user table should only contain "Librarian"

  Scenario: User group Students User Management
    When I select User group "Students"
    And I select Show 50 records
    Then Groups columns in user table should only contain "Students"

  Scenario: Remember record count User Management
    And I select Show 50 records
    When I select User group "Students"
    Then show records default value should be 50
