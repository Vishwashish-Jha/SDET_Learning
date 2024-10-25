Feature: login functionality

@sanity
  Scenario: validate login and logout functionality with valid user credentials1

    Given User Launch Chrome browser
    When  User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And   User enters Username as "Admin" and Password as "admin123"
    And   Click on Login
    Then  Page URL should contains be "dashboard"
    When  User click on user dropdown
    When  User click on Logout
    Then  Page URL should contains be "/auth/login"
    And   Close browser
    
    
    
 #@sanity
	Scenario: validate login and logout functionality with valid user credentials2

    Given User Launch Chrome browser
    When  User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And   User enters Username as "Admin" and Password as "admin123"
    And   Click on Login
    Then  Page URL should contains be "dashboard"
    When  User click on user dropdown
    When  User click on Logout
    Then  Page URL should contains be "/auth/loginfeature"
    And   Close browser
    

