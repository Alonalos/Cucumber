Feature: Add new user dialog
 
  Scenario: Placeholder tests
    Given I am on the login page
    And I login using following credentials:
    |email   |librarian21@library|
    |password|aZ849tSZ           |
    And I click on "Users" link
    When I click on Add User
    Then dialog fields must have matching placeholders
    |fullname|Full Name|
    |email   |Email    |
    |password|Password |
    |address  |        |


  Scenario: Verify user information

    Given I am on the login page
    And I login using following credentials:
      | email    | librarian21@library |
      | password | aZ849tSZ            |
    And I click on "Users" link
    When I search for "486"
    Then table should contain this data
      | User ID   | 486                             |
      | Full Name | Asuncion Pfeffer                |
      | Email     | Oralia Daugherty234@library.com |

      # when we get value of an attribute from web element and
      # the web element has that attribute,
      # what we get back is the actual value

        # when we get value of an attribute from web element and
      # the web element does not that attribute,
      # what we get back is an empty string.


  # selenium tips we may or may not need # 24234234

