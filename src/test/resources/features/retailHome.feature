@Jinken
@CICDTest
Feature: This feature is use for testing UI of Retail page

  Background: 
    Given User is on retail website


  Scenario: Verify user can search a product
    When User search for "pokemon" product
    Then The product should be displayed


  Scenario: Verify shop by department sidebar
    When User click on All section
    Then Below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |



  Scenario Outline: Verify Department sidebar options
    When User click on All section
    And User click on '<department>'
    Then Below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                     | optionTwo                |
      | Electronics | TV & Video                    | Video Games              |
      | Computers   | Accessories                   | Networking               |
      | Smart Home  | Smart Home Lightning          | Plugs and Outlets        |
      | Sports      | Athletic Clothing             | Exercise & Fitness       |
      | Automative  | Atomative Parts & Accessories | Motorcycle & Powersports |
      
      

  Scenario: Verify User can add an item to cart
    When User click on sign in option
    And User enter email 'shakoko@koko.com' and password 'SHAkoko12@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    Then the cart icon quantity should change to ‘2


  Scenario: Verify User can place an order without Shipping address and payment Method on file
    When User click on sign in option
    And User enter email 'shakoko@koko.com' and password 'SHAkoko12@'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'Kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity ‘2’
    And User click add to Cart button
    And the cart icon quantity should change to ‘2
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | value   | value    | value       | value         | value | value | value | value   |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | 4422442244224422 | Shadgul jan |              10 |           2025 |          123 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’

  
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    When User click on sign in option
    And User enter email 'shakoko@koko.com' and password 'SHAkoko12@'
    And User click on login button
    And User should be logged in into Account
    And User Change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on the item
    And User select quantity ‘5’
    And User click add to Cart button
    And the cart icon quantity should change to ‘5
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’
