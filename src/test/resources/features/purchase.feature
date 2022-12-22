Feature: Purchase E2E test

  Background:
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce"
    Then The user should be able to login and see "PRODUCTS" page

  @wip
  Scenario: Sauce Purchase
    When The user should be able to sort the product "Price (high to low)"

  When The user should be able to select products with index number "2"
  When The user should be able to select products with index number "6"
    When The user should be able to open the basket
    When The user should be able to checkout
    When The user should enter first name "SenaRana" lastname "Yusuf" and postal code "06046"
    When The user should be able to click continue button
    When The user should be able to finish the purchase
   Then Verify that your order were completed with message "Your order has been dispatched, and will arrive just as fast as the pony can get there!"










