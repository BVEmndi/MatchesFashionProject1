Feature:Search Functionality

  As a Customer
  I want to search for a product
  so that I buy them

  @Smoke
  Scenario: Customer want to search for an item
    Given Customer is in the HomePage
    When customer enter the product name to search
    And click submit
    Then customer should see the product details he entered


