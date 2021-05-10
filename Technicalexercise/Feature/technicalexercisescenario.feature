Feature: Technical Exercise

  Scenario: Login, Create & delete Categories, Logout
    Given User "ROHAN" is logged to WPN Staging
    Then User should get navigated to welcome page successfully
    And user navigate to back end Admin Panel
    And user clicks on categories
    Given user creates a category "Movies"
    Then category should get created successfully "Movies"
    Given user deletes the category "Movies"
    Then category should get deleted successfully "Movies"
    And user clicks on Goto My site
  	Then User should get navigated to welcome page successfully
  	And logged out of the application
  	
  	
    

	