package stepdefintions;

import java.io.FileInputStream;
import java.util.Properties;
import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.SelectPage;
import utilities.TestBase;


public class SelectFlightStepDefinition extends TestBase {

	public Properties prop;
	int departureFlightPrice=0;
	int returnFlightPrice=0;
	
	
	HomePage homepage;
	SelectPage selectpage;
	
	
	@Given("^user navigate to Home page$")
	public void user_navigate_to_Home_page() throws Throwable {
		
		prop= new Properties();
		FileInputStream fis=new FileInputStream("./Configurations/config.properties");

		prop.load(fis);		
		driver= initializeDriver(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		
	}

	@Then("^user verifies One Way radio button is selected$")
	public void user_verifies_One_Way_radio_button_is_selected() throws Throwable {
		homepage = new HomePage(driver);
		homepage.verifyOneWayOptionChecked();
	}

	@When("^user clicks on Round Trip Radio button$")
	public void user_clicks_on_Round_Trip_Radio_button() throws Throwable {
		homepage.checkRoundTripOption();
	}

	@When("^Select the Departure City as \"([^\"]*)\" and Arrival city as \"([^\"]*)\"$")
	public void select_the_Departure_City_as_and_Arrival_city_as(String depatureCity, String arrivalCity) throws Throwable {
		
		homepage.selectDepartureCity(depatureCity);		
		homepage.selectArrivalCity(arrivalCity);
	}

	@When("^Select the Passengers as \"([^\"]*)\"$")
	public void select_the_Passengers_as(String noOfPassengers) throws Throwable {
	    homepage.selectNoOfAdults(noOfPassengers);
	    
	}
	
	 @And("^Select Senior Citizen Checkbox$")
	 public void select_senior_citizen_checkbox() throws Throwable {
		 homepage.selectSeniorCitizens();
	 }

	@When("^clicks on Search Button$")
	public void clicks_on_Search_Button() throws Throwable {
	    homepage.clickOnSearchButton();
	}

	@Then("^Flights availability table is displayed$")
	public void flights_availability_table_is_displayed() throws Throwable {
		selectpage = new SelectPage(driver);
	    selectpage.verifyDepartureFlighttable();
	}

	@When("^user clicks on Senior citizens terms and conditions$")
	public void user_clicks_on_Senior_citizens_terms_and_conditions() throws Throwable {
	    selectpage.checkTermsAndCondtions();
	}

	@Then("^Senior citizens terms and condtions should get checked$")
	public void senior_citizens_terms_and_condtions_should_get_checked() throws Throwable {
		selectpage.verifyTermsAndConditionsChecked();
	}

	@When("^user selects the costliest flights$")
	public void user_selects_the_costliest_flights() throws Throwable {
		selectpage.selectTopPriceDepartureFlight();
	    departureFlightPrice = selectpage.getTopPriceDepartureFlight();
	    selectpage.selectTopPriceReturnFlight();
	    returnFlightPrice = selectpage.getTopPriceReturnFlight();
	  }

	@Then("^total fare should be updated$")
	public void total_fare_should_be_updated() throws Throwable {
	    Assert.assertEquals(departureFlightPrice*2,selectpage.getDepatureFare());
	    Assert.assertEquals(returnFlightPrice*2,selectpage.getReturnFare());
	}
	
	
}
