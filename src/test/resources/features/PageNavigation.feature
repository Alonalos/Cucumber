Feature: Page navigation links
  #login as librarian
  #click on the user link
  #verify page Users

  #login as librarian
  #click on the Books link
  #verify page Books
  @run
  Scenario: Go to the user page
  Given I am on the login page
    And I login as a librarian
    When I click on "Users77" link
    Then "Users" page should be displayed
