$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SelectFlight.feature");
formatter.feature({
  "line": 1,
  "name": "Selecting highest price filight",
  "description": "",
  "id": "selecting-highest-price-filight",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Select highest price flight for two senior citizens",
  "description": "",
  "id": "selecting-highest-price-filight;select-highest-price-flight-for-two-senior-citizens",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user navigate to Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user verifies One Way radio button is selected",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Round Trip Radio button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Select the Departure City as \"BLR\" and Arrival city as \"HYD\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select Senior Citizen Checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Select the Passengers as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicks on Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Flights availability table is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on Senior citizens terms and conditions",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Senior citizens terms and condtions should get checked",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user selects the costliest flights",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "total fare should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectFlightStepDefinition.user_navigate_to_Home_page()"
});
formatter.result({
  "duration": 15191731200,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.user_verifies_One_Way_radio_button_is_selected()"
});
formatter.result({
  "duration": 101173500,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.user_clicks_on_Round_Trip_Radio_button()"
});
formatter.result({
  "duration": 214735600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BLR",
      "offset": 30
    },
    {
      "val": "HYD",
      "offset": 56
    }
  ],
  "location": "SelectFlightStepDefinition.select_the_Departure_City_as_and_Arrival_city_as(String,String)"
});
formatter.result({
  "duration": 1034235000,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.select_senior_citizen_checkbox()"
});
formatter.result({
  "duration": 223672800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    }
  ],
  "location": "SelectFlightStepDefinition.select_the_Passengers_as(String)"
});
formatter.result({
  "duration": 492251600,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.clicks_on_Search_Button()"
});
formatter.result({
  "duration": 6742242900,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.flights_availability_table_is_displayed()"
});
formatter.result({
  "duration": 130795500,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.user_clicks_on_Senior_citizens_terms_and_conditions()"
});
formatter.result({
  "duration": 156431900,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.senior_citizens_terms_and_condtions_should_get_checked()"
});
formatter.result({
  "duration": 39079900,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.user_selects_the_costliest_flights()"
});
formatter.result({
  "duration": 382162500,
  "status": "passed"
});
formatter.match({
  "location": "SelectFlightStepDefinition.total_fare_should_be_updated()"
});
formatter.result({
  "duration": 1152899800,
  "status": "passed"
});
});