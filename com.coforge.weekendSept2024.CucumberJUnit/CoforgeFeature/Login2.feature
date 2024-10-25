Feature: login functionality

@sanity
  Scenario: validate login and logout functionality with valid user credentials JUNIT Test

    Given User Launch Chrome browser
    When  User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And   User enters Username as "Admin" and Password as "admin123"
    And   Click on Login
    Then  Page URL should contains be "dashboard"
    When  User click on user dropdown
    When  User click on Logout
    Then  Page URL should contains be "/auth/login"
    And   Close browser
    
    
@smoke
  Scenario: validate login and logout functionality with valid user credentials Smoke JUNIT Test

    Given User Launch Chrome browser
    When  User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And   User enters Username as "Admin" and Password as "admin123"
    And   Click on Login
    Then  Page URL should contains be "dashboard"
    When  User click on user dropdown
    When  User click on Logout
    Then  Page URL should contains be "/auth/login"
    And   Close browser