Feature: product feature
@regression
Scenario: Adding product to the cart
Given launch chromebrowser
And enter url as "https://automationteststore.com/"
When user click on Login or Register Button
And enter Username as "theja07" 
And enter password as "Chaitup@207"
And click on login
And click on search
And add Men+Care Active Clean Shower Tool
And add item to cart
And proceed to checkout page
Then checkout confirmation page will be displayed
