Feature: Login
  I want to verify the login functionality of saucedemo website with diffrent kind of users

@login
  Scenario Outline: Verirfy login fuctionality
    Given user is on saucedemo login page
    When user enters credentials for '<user>' on login page
    Then user should be navigated to 'inventory' page and show error message for locked user

    Examples: 
      | user                    |
      | standard_user           |
      | locked_out_user         |
      | problem_user            |
      | performance_glitch_user |
