@smoke
Feature: Retail Account Page

Background:
  	Given User is on retail website
    When User click on Sign in option
    And User enter email 'guardianscucumbe3@gmail.com' and password 'Guardians@a1'
    And User click on login button
    Then User should be logged in into Account

@updatePI
Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Ahmad Najeem' and Phone '4214653342'
    And User click on Update button
    Then user profile information should be updated
    
    
    
   @paymentMethod 
    Scenario: Verify User can add a payment method
    When User click on Account option
    #And User click on Add a payment method link
    And User fill Debit or credit card information
    |cardNumber          |nameOnCard       |expirationMonth|expirationYear|securityCode|
    |4668487412334912    |Ahmad Najeem     |5              |2025          |006       |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’
    
    
    
    @paymentUpdate
    Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And user click on existing card
    And User click on Edit option of card section
    And user edit information with below data
    |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
    |4668487812331234     | Ahmad Najeem J    |4         |2024         |988       |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’
    
    
    @removePaymentMethod
    Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And user click on existing card
    And User click on remove option of card section
    #Then payment details should be removed
    
    
    @addAddress
    Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
    |country |fullName      |phoneNumber  |streetAddress     |apt     |city         | state |zipCode   |
    |"United States" |Ahmad Najeem  | 9168406868   |5300 Hackberry Ln |230     |Sacramento   | Califronia    | 95828    |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'
    
    
    #editAddres
    @editAddress
    Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
    |country|fullName|phoneNumber|streetAddress|apt       |city     | state |zipCode   |
    |"United States" |Ahmad   | 9168406868   |8861 Hackberry Ln |108    |Sacramento   | Califronia    | 95828    |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’
    
    #RemoveAddress
    @removeAddress
    Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    #Then Address details should be removed