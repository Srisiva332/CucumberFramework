package utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public WebDriver driver;
	public WebDriver initializeDriver(String browserName) throws IOException
	{

		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./WebDrivers/chromedriver.exe");
			driver= new ChromeDriver();	
		}
		else if (browserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else {
			System.out.println("Please select the Chrome & Firefox browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
}
	

}
