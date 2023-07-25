Feature: Test the SauceDemo Website

		Scenario: To test the SauceDemo Website
			Given I am in the login page of SauceDemo
			When I enter the username and password
			And click the signin button
			And I click on the "Add to cart"button for "Sauce Labs Backpack"
			And I click on the "Cart" button Icon
			And I enter the firstName lastName and postalcode
			And click the continue button
			And I click on Finish button
			Then I validate the outcomes