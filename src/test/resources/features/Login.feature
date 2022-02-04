#As a user, I should be able to login with correct credentials to different accounts.
#And dashboard should be displayed.
#Accounts are: librarian, student, admin

Feature: As a user, I should be able to login with correct credentials
  to different accounts.And dashboard should be displayed.

  @librarian
  Scenario: Librarian should be able to login with correct credentials and see Dashboard
    Given Librarian is on login page
    When  Librarian logs in as librarian using correct credentials
    Then  Librarian should see Dashboard


  @student
  Scenario: Student should be able to login with correct credentials and see Dashboard
    Given Student is on login page
    When  Student logs in as librarian using correct credentials
    Then  Student should see Dashboard

  @admin
  Scenario: Admin should be able to login with correct credentials and see Dashboard
    Given Admin is on login page
    When  Admin logs in as librarian using correct credentials
    Then  Admin should see Dashboard