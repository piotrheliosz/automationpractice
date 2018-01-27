Feature: LoginFeature
  This is login feature

  Scenario: Login with correct username and password
    Given Navigate to login page
    And Pass username and password following
      | Username       | Password | URL         |
      | ruca2@fnzm.net | qwerty   | www.www.www |
    And Click on login button
    Then Should be login with my user
    And Browser is closed