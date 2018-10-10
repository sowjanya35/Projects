package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
		 System.setProperty("webdriver.gecko.driver", "D://testingPy//drivers//geckodriver.exe");					
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }		

   @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.id("email")).sendKeys("asdkj@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("asdkj@gmail.com");
    }	

    @Then("^Click Login Button$")					
    public void Click_Login_Button() throws Throwable 							
    {    		
       driver.findElement(By.id("loginbutton")).click();
    }		

}
