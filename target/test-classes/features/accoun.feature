Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on sign in option
    And User enter email 'shakoko@koko.com' and password 'SHAkoko12@'
    And User click on login button
    Then User should be signed in

  Scenario: Verify user can update profile information
    When User click on account option
    And User update Name 'shakoko' and Phone '5756986556'
    And User click on update button
    Then User profile information should be updated

  @test
  Scenario: Verify User can add an address
    When User click on account option
    And User click on Add address option
    And User fill new address with below information
      | country | fullName | phoneNumber | streetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then a messege should be displayed 'Address Added Successfully'

  
  Scenario: Verify User can Update password
    When User click on account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | SHAkoko12@       | SHAkoko120@ | SHAkoko120@     |
    And User click on Change Password button
    Then a messege should be displayed2 'Password Updated Successfully’
    
    
    Scenario: Verify User can add a payment method 
    When User click on account option 
    And User click on Add a payment method link 
    And User fill Debit or credit card information 
    |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    |8765432876543567 | gulguli |7 |2027 |777 |
    And User click on Add your card button 
    Then a message should be displayed 'Payment Method added successfully’
    
    
    Scenario: Verify User can edit Debit or Credit card 
    When User click on account option
    And User click on card that want to edit 
    And User click on Edit option of card section
    And user edit information with below data 
    |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    |0808080808999908 | mulmuli |8 |2028 |888 |
    And user click on Update Your Card button 
   Then a message should be displayed ‘Payment Method updated Successfully’
   
   
   Scenario: Verify User can remove Debit or Credit card 
   When User click on account option 
   And User choose card for deletion
   And User click on remove option of card section
   Then payment details should be removed
   
