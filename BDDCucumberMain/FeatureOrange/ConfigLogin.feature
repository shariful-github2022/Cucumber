Feature: OrangeHRM Login with config & pom 

  
  Scenario: User Login by using username & password
    Given User Open Chrome Browser
    And User put the Orange HRM url
    When User put the Username 
    And User put the Password
    And User click the Signin
    And User get the Title 
    And User get the URL
    Then User Successfully login
    And User close the browser

  