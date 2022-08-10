@test
Feature: the user logs into his account, searches for a product, filters his search and adds the product to the cart 

@Naviguer
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And  user is on login page
    When user enter his email <username>
    And  user enters his password <password>
    Then  user is on home page
   Examples:
   |username|password|
   |ghadaa.ghram@gmail.com|Gh11046090|

@Ajouter
  Scenario Outline: Verify that the user can add a product to the cart
  Given user is looking for a product <product>
  And   user enter lower price limit  <min> 
  And   user enter upper price limit  <max>
  And   user enter click ok
  When  user select the product
  And   user add the product to the cart
  Then the product is on the cart 
  And user sign out
  Examples:
   |product|min|max|
   |ecran solaire|20|100|