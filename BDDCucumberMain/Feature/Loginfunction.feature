

Feature: Login function
  

 
  Scenario: User successfully login with using username & passwor
    Given user open browser
    And user put the url
    When user click on sign in button
    And user put username
    And user put password
    And user click on sign in button
    Then successfully login
    And close the driver

  
