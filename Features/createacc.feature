Feature: Create a account for Luma application

  Scenario Outline: Successful createting account for luma application
  
    Given User launch the chrome browser
    When User open URL "https://magento.softwaretestingboard.com/"
    And User click on Create new accout link
    When User enters first name "<firstName>"
    And User enters last name "<lastName>"
    And User enters email "<email>"
    And User enters password "<password>"
    And User confirms password "<confirmPassword>"
    And User clicks on the "Create an Account" button
   # Then User should navigate to Home screen
    
    Examples:
    |firstName|lastName|email|password|confirmPassword|
    |Mitul|Raj|mitul2@gmail.com|Hello@12345|Hello@12345|
  
 # still showing confirm password doesent match with actual password