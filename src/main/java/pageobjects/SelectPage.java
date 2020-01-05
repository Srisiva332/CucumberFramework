package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.TestBase;

public class SelectPage extends TestBase {
	
	
	int departureFlightPrice = 0;
	int returnFlightPrice = 0;
	
	public SelectPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using = "ControlGroupSelectView_AvailabilityInputSelectView_SeniorCitizen")
	private WebElement chkbx_termsAndCondtions;
	
	@FindBy(how=How.ID, using = "availabilityTable0")
	private WebElement tb_departureFlight;
	
	@FindBy(how=How.XPATH, using = "//*[@id='availabilityTable0']/tbody/tr[last()]/descendant::input")
	private WebElement rdbtn_departureFlight;
	
	@FindBy(how=How.XPATH, using = "//*[@id='availabilityTable0']/tbody/tr[last()]/descendant::span[@class='flightfare']")
	private WebElement lbl_departureFlight;
	
	@FindBy(how=How.XPATH, using = "//*[@id='availabilityTable1']/tbody/tr[last()]/descendant::input")
	private WebElement rdbtn_returnFlight;
	
	@FindBy(how=How.XPATH, using = "//*[@id='availabilityTable1']/tbody/tr[last()]/descendant::span[@class='flightfare']")
	private WebElement lbl_returnFlight;
	
	@FindBy(how=How.XPATH, using = "//*[@class='t_price'][1]/span")
	private WebElement lbl_depatureFare;
	
	@FindBy(how=How.XPATH, using = "//*[@class='t_price'][2]/span")
	private WebElement lbl_returnFare;
	
	
	public void verifyDepartureFlighttable(){
		Assert.assertTrue(tb_departureFlight.isDisplayed());
	}
	
	public void verifyTermsAndConditionsChecked() {
		Assert.assertTrue(chkbx_termsAndCondtions.isSelected());
	}
	
	public void checkTermsAndCondtions() {
		chkbx_termsAndCondtions.click();
	}
	
	
	public void selectTopPriceDepartureFlight() {
		rdbtn_departureFlight.click();
	}
	
	public void selectTopPriceReturnFlight() {
		rdbtn_returnFlight.click();
	}
	
	public int getTopPriceDepartureFlight() {
		String departureTopPricelabel = lbl_departureFlight.getText();
	    String topPrice[] = departureTopPricelabel.split("\\s+");
	    return Integer.parseInt(topPrice[0].replace(",",""));
	}
	
	public int getTopPriceReturnFlight() {
		String returnTopPricelabel = lbl_returnFlight.getText();
	    String returnTopPrice[] = returnTopPricelabel.split("\\s+");
	    return Integer.parseInt(returnTopPrice[0].replace(",",""));
	}
	
	public int getDepatureFare() throws InterruptedException {
		Thread.sleep(1000);
		return Integer.parseInt(lbl_depatureFare.getText().replace(",",""));
	    
	}
	
	public int getReturnFare() {
		return Integer.parseInt(lbl_returnFare.getText().replace(",",""));
	}
	
	

}
