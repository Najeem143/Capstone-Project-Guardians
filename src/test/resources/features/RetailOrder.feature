@smoke
Feature: Retail Order Page

Background: Retail order page
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'guardianscucumbe3@gmail.com' and password 'Guardians@a1'
    And User click on login button
    Then User should be logged in into Account

@addItemToCart
Scenario: Verify User can add an item to the cart
    And User changes the category to 'Smart Home'
    And User searches for an item 'kasa outdoor smart plug'
    And User clicks on the Search icon
    And User clicks on the item
    And User selects quantity '2'
    And User clicks the add to Cart button
    Then the cart icon quantity should change to '2'
    
    @addItemToCart2
Scenario: User can place an order with Shipping address and payment Method on file
    And User changes the category on tek retail web site to 'Electronics'
    And User searches on tek retail web site for an item 'Apex Legends'
    And User clicks on the Search icon
    And User clicks on the item search for on Tek Web
    And User selects quantity '5'
    And User clicks the add to Cart button
    Then the cart icon quantity should change to '5'
    And User clicks on the Cart option
    And User clicks on the Proceed to Checkout button
    And User clicks on the Place Your Order button
    
    @cancelOrder
Scenario: Verify User can cancel an order
    And User clicks on the Orders section
    And User clicks on the first order in the list
    And User clicks on the Cancel The Order button
    And User selects the cancellation reason 'Bought wrong item'
    And User clicks on the Cancel Order button
    Then a cancellation message should be displayed 'Your Order Has Been Cancelled'
    
    @returnItems
Scenario: Verify User can return items
		And User clicks on the Orders section
    And User clicks on Return Items button
    And User selects the Return Reason 'Item damaged'
    And User selects the drop-off service 'FedEx'
    And User clicks on the Return Order button
    Then a return message should be displayed 'Return was successful'
    
    @addReview
Scenario: Verify User can add a product review
    And User clicks on the Orders section
    And User clicks on the first order in the list
    And User clicks on the Review button
    And User writes a Review headline 'Great product' and 'The product is very sturdy and very durable'
    And User clicks the Add your Review button
    #Then a review message should be displayed 'Your review was added successfully'
    