@Jinken
@CICDTest
Feature: Tek Rtail application sign in feature

  Background: 
    Given User is on retail website
    When User click on sign in option

  
  Scenario: Verify user can sighn in into Retail application
    And User enter email 'shakoko@koko.com' and password 'SHAkoko12@'
    And User click on login button
    Then User should be signed in
    
    

  ## Scenario  outline  Example which test the case with defernt scenario
  Scenario Outline: Verify user can sighn in into Retail application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be signed in

    Examples: 
      | email            | password      |
      | laila@gmail.com  | 12345@Meyouwe |
      | shakoko@koko.com | SHAkoko12@    |


  Scenario: Verify user can create an account into retail website
    And User click on create new account button
    And User fill the signUp information with the bewlow data
      | name     | email | password  | confirm password |
      | fullName | email | Tek@12345 | Tek@12345        |
    And User click on signUp button
    Then User should be logged into account page
