@smartBear
Feature: SmartBear order process


  Background:
  Given User logs into SmartBear Tester account
  And User clicks on Order page

  Scenario: User fills out the form
   When  User selects FamilyAlbum from product dropdown
   And User enters 4 to quantity
   And User enters "John Wick" to costumer name
   And User enters "Kinzie Ave" to street
   And User enters "Chicago" to city
   And User enters "IL" to state
   And User enters 60056 to zip
   And User selects Visa as card type
   And User enters "1111222233334444" to card number
   And User enters "12/22" to expiration date
   And User clicks process button
   Then User verifies "John Wick" is in the list



#TC#27: SmartBear order process
#1. User is logged into SmartBear Tester account and on Order page
#2. User fills out the form as followed:
#3. User selects FamilyAlbum from product dropdown
#4. User enters 4 to quantity
#5. User enters John Wick to costumer name
#6. User enters Kinzie Ave to street
#7. User enters Chicago to city
#8. User enters IL to state
#9. User enters 60056
#10.User selects Visa as card type
#11.User enters 1111222233334444 to card number
# 12.User enters 12/22 to expiration date
#13.User clicks process button
#14.User verifies John Wick is in the list

#Note: Follow POM, and solution should be done using Cucumber parameterization