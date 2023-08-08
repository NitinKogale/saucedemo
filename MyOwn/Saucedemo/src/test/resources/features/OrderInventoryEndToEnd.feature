Feature: Place order end To end
  I verify the placing order functionality end to end

  Scenario: Verirfy placing order fuctionality
    Given user is on saucedemo login page
    When user enters credentials for 'standard_user' on login page
    Then user should be navigated to 'inventory' page
		When user adds two most expensive products in cart
		And clicks on cart button
		Then user is navigated to Cart page and verifies two products added
		When user clicks on checkout button
		Then user should be navigated to Checkout page and fills in the form
		When user clicks the Continue button
		Then user is navigated to Overview page and verifies the total amount before tax
		And user verfies the url of Overview page
		When user clicks on Finish button
		Then user should be displayed with Thank you and order dispatch message
		
