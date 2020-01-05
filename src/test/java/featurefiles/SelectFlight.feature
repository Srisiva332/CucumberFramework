Feature: Selecting highest price filight

Scenario: Select highest price flight for two senior citizens
Given user navigate to Home page
Then user verifies One Way radio button is selected
When user clicks on Round Trip Radio button
And Select the Departure City as "BLR" and Arrival city as "HYD"
And Select Senior Citizen Checkbox
And Select the Passengers as "2"
And clicks on Search Button
Then Flights availability table is displayed
When user clicks on Senior citizens terms and conditions
Then Senior citizens terms and condtions should get checked
When user selects the costliest flights
Then total fare should be updated
