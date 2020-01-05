package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.TestBase;

public class HomePage extends TestBase  {
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using = "ctl00_mainContent_rbtnl_Trip_0")
	private WebElement chkbx_oneWay;
	
	@FindBy(how=How.ID,using = "ctl00_mainContent_rbtnl_Trip_1")
	private WebElement chkbox_roundTrip;
	
	@FindBy(how=How.ID,using = "ctl00_mainContent_ddl_originStation1_CTXT")
	private WebElement txtbx_departureCity;
	
	@FindBy(how=How.ID,using = "ctl00_mainContent_ddl_destinationStation1_CTXT")
	private WebElement txtbx_arrivalCity;
	
	@FindBy(how=How.ID,using = "divpaxinfo")
	private WebElement drpdw_passengers;
	
	@FindBy(how=How.ID,using = "ctl00_mainContent_ddl_Adult")
	private WebElement drpdw_adults;
	
	@FindBy(how=How.ID,using = "ctl00_mainContent_chk_SeniorCitizenDiscount")
	private WebElement chkbx_SeniorCitizen;
	
	@FindBy(how=How.ID,using = "ctl00_mainContent_btn_FindFlights")
	private WebElement btn_search;
	
	
	public void verifyOneWayOptionChecked()
	{
		Assert.assertTrue(chkbx_oneWay.isSelected());
	}
	
	public void checkRoundTripOption()
	{
		chkbox_roundTrip.click();
	}
	
	public void selectDepartureCity(String depatureCity)
	{
		txtbx_departureCity.sendKeys(depatureCity);
	}
	
	public void selectArrivalCity(String arrivalCity)
	{
		txtbx_arrivalCity.sendKeys(arrivalCity);
		driver.findElement(By.xpath("//a[contains(text(),'"+ arrivalCity +"')][1]")).click();
	}
	
	public void selectNoOfAdults(String noOfAdults)
	{
		drpdw_passengers.click();
		Select adultsOption = new Select(drpdw_adults);
		adultsOption.selectByValue(noOfAdults);
	}
	
	public void selectSeniorCitizens() {
		chkbx_SeniorCitizen.click();
	}
	
	public void clickOnSearchButton() {
		btn_search.click();
	}
	
	

}
