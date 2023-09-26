@smoke
Feature: Sign in Feature
​

@Login
Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'guardianscucumbe3@gmail.com' and password 'Guardians@a1'
    And User click on login button
    Then User should be logged in into Account
    
    @NewAccount
Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
    | name   | email                      | password    | confirmPassword |
    | student| newStudentt55ddd@tekschool.us | Najeem1433@ | Najeem1433@     |
    And User click on SignUp button
    Then User should be logged into account page