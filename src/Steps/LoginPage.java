package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {

	HomePage prop = new HomePage();
	WebDriver driver;

	@Given("^Open given browser \"([^\"]*)\"$")
	public void open_given_browser(String browser) {
		driver = prop.getDriver(browser);
		prop.openBrowser();
	}

	@Then("^user is on Login page$")
	public void user_is_on_Login_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Client Area - PHPTRAVELS", title);
	}

	@When("^Enter the email \"(.*)\" and Password \"(.*)\"$")			
    public void enter_the_email_and_Password(String username,String password) throws Throwable 							
    {		
       driver.findElement(By.id("inputEmail")).sendKeys(username);					
       driver.findElement(By.id("inputPassword")).sendKeys(password);					
    }		


	@When("^click login button")
	public void click_login_button() throws Throwable {
		driver.findElement(By.id("login")).click();
		driver.close();
		
	}

}

