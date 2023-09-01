Feature: Page Functionality Test
  As a user I want to check Functionality of Building and Material Page

  @smoke, @regression
  Scenario: User should verify the functionality
    Given   I am on HomePage
    When    I click on BuildingAndMaterial Link
    And     I click on Roof Felt
    And     I can see Roof Felt in Black Font
    And     I select Roof Felt fourByTen Kit
    And     I can see Message in front of the page
    And     I select size "7*7" from the dropdown
    And     I clear the quantity
    And     I write Quantity "5"
    And     I click To AddTo Delivery Button
    Then    I click on Basket