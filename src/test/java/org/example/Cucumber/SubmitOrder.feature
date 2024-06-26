Feature: Purchase the order from Ecommerce Website

Background:
  Given I landed on Ecommerce Page



Scenario Outline: Positive Test of submitting the order
  Given Logged in with the username <name> and password <password>
  When I add product <productName> to Cart
  And Checkout <productName> and submit the order
   #Then "THANKYOU FOR THE ORDER" message is displayed on confirmation Page

  Examples:
    | name                  | password     | productName |
    | rahulshetty@gmail.com | IamKing@0 00 | ZARA COAT 3 |