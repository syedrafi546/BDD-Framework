package stepDefinations;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import io.cucumber.junit.Cucumber;
import pageObjects.ActUpdatePage;
import pageObjects.AppDwndPage;
import pageObjects.BookingforLocal;
import pageObjects.LogoutPage;
import pageObjects.MngBookingsPage;
import pageObjects.SignIn;
import pageObjects.TripAdvisorPage;
import pageObjects.UserregisterPage;
import resources.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@RunWith(Cucumber.class)
public class stepDefination extends base {
	public static Logger log = LogManager.getLogger(stepDefination.class.getName());
	//Register
    @Given("^Initialize browser with chrome$")
    public void initialize_browser_with_chrome() throws Throwable {
    	 driver =initializeDriver();
    }
    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	 driver.get(strArg1);
    	 driver.manage().window().maximize();
    	 log.info("Savaari page navigated successfully");

    }
    @And("^click on sign link in home page to land on secure sign in page$")
    public void click_on_sign_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
    	UserregisterPage ur=new UserregisterPage(driver);
    	ur.getsiginbutton().click();
    }

    @When("^User enters details and register$")
    public void user_enters_details_and_register() throws Throwable {
    	UserregisterPage ur=new UserregisterPage(driver);
    	ur.getreg().click();
		ur.getname().sendKeys("syed");
		ur.getnumber().sendKeys("8106423357");
		ur.getemail().sendKeys("syedrafi34@gmail.com");
		ur.getpass().sendKeys("123456");
		ur.getrepass().sendKeys("123456");
		Thread.sleep(2000);
    }
    @And("^click on register$")
    public void click_on_register() throws Throwable {
    	UserregisterPage ur=new UserregisterPage(driver);
    	ur.getclick().click();
		Thread.sleep(5000);
		log.info("successfully account created for savaari.com");
    }


    @Then("^Close the driver$")
    public void close_the_driver() throws Throwable {
       driver.close();
    }
    
    //Login
    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	 driver =initializeDriver();
    }
    @And("^Navigate \"([^\"]*)\" site$")
    public void navigate_something_site(String strArg1) throws Throwable {
    	 driver.get(strArg1);
    	 driver.manage().window().maximize();
    	 log.info("Savaari page navigated successfully");
         
    }

    @When("^User enters (.+) and (.+) and login$")
    public void user_enters_and_and_login(String username, String password) throws Throwable {
    	SignIn sg=new SignIn(driver);
    	sg.signin().click();
    	sg.getEmail().sendKeys(username);
    	sg.getPassword().sendKeys(password);
    	Thread.sleep(3000);
    	sg.getSigninButton().click();
    	Thread.sleep(4000);
    	log.info("Login successfully");
         
    }

    
    @Then("^Close driver$")
    public void close_driver() throws Throwable {
    	driver.close();
         
    }
    
    //Car check for local
    @Given("^Initialize a browser with chrome$")
    public void initialize_a_browser_with_chrome() throws Throwable {
    	driver =initializeDriver();
    }
    @And("^Navigate to the \"([^\"]*)\" site$")
    public void navigate_to_the_something_site(String strArg1) throws Throwable {
    	 driver.get(strArg1);
    	 driver.manage().window().maximize();
    	 log.info("Savaari page navigated successfully");
    }

    @When("^User clicks on local and select location and search$")
    public void user_clicks_on_local_and_select_location_and_search() throws Throwable {
    	SignIn sg=new SignIn(driver);
    	sg.signin().click();
    	sg.getEmail().sendKeys("syedrafi546@gmail.com");
    	sg.getPassword().sendKeys("uqumyq");
    	Thread.sleep(3000);
    	sg.getSigninButton().click();
    	BookingforLocal bo=new BookingforLocal(driver);
		bo.getlocal().click();
		bo.getfrom().sendKeys("Bangalore"+Keys.ENTER);
		Thread.sleep(3000);
		bo.getsearch().click();
		Thread.sleep(4000);
		log.info("navigated to car selection successfully");
        
    }

    @Then("^Driver close$")
    public void driver_close() throws Throwable {
    	driver.close();
       
    }
    
    //Manage Bookings
    @Given("^Initialize a browser wt chrome$")
    public void initialize_a_browser_wt_chrome() throws Throwable {
    	driver =initializeDriver();
    }

    @And("^Navigate to thee \"([^\"]*)\" site$")
    public void navigate_to_thee_something_site(String strArg1) throws Throwable {
    	 driver.get(strArg1);
    	 driver.manage().window().maximize();
    	 log.info("Savaari page navigated successfully");
    }

    @When("^User enter the login details and login$")
    public void user_enter_the_login_details_and_login() throws Throwable {
    	SignIn sg=new SignIn(driver);
    	sg.signin().click();
    	sg.getEmail().sendKeys("syedrafi546@gmail.com");
    	sg.getPassword().sendKeys("uqumyq");
    	Thread.sleep(3000);
    	sg.getSigninButton().click();
    	MngBookingsPage mb=new MngBookingsPage(driver);
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'sv_header\']/div/div[3]/div/a[3]/img")).click();
		mb.getbookings().click();
		Thread.sleep(2000);
		mb.getslt().click();
		Thread.sleep(5000);
		log.info("All bookings are diplayed");
     
    }
    @Then("^Driver should close$")
    public void driver_should_close() throws Throwable {
      driver.close();
    }
    
    //Account update page
    @Given("^Initialize browser wt chrome$")
    public void initialize_browser_wt_chrome() throws Throwable {
    	driver =initializeDriver();
    }
    @And("^Navigate thee \"([^\"]*)\" site$")
    public void navigate_thee_something_site(String strArg1) throws Throwable {
    	 driver.get(strArg1);
    	 driver.manage().window().maximize();
    	 log.info("Savaari page navigated successfully");
    }
    
    @When("^User enter the login details and navigated to the account update page$")
    public void user_enter_the_login_details_and_navigated_to_the_account_update_page() throws Throwable {
    	SignIn sg=new SignIn(driver);
    	sg.signin().click();
    	sg.getEmail().sendKeys("syedrafi546@gmail.com");
    	sg.getPassword().sendKeys("uqumyq");
    	Thread.sleep(2000);
    	sg.getSigninButton().click();
    	ActUpdatePage up=new ActUpdatePage(driver);
    	Thread.sleep(2000);
		up.getclick().click();
		Thread.sleep(3000);
		up.getactstg().click();
		Thread.sleep(3000);
		 log.info("Account settings page navigated successfully");
    }

    @Then("^Driver should be close$")
    public void driver_should_be_close() throws Throwable {
        driver.close();
    }
    
    //Trip Advisor
    
    @Given("^Initialize browser chrome$")
    public void initialize_browser_chrome() throws Throwable {
    	driver =initializeDriver();
    }

    @And("^Navigate too \"([^\"]*)\" site$")
    public void navigate_too_something_site(String strArg1) throws Throwable {
    	 driver.get(strArg1);
    	 driver.manage().window().maximize();
    	 log.info("Savaari page navigated successfully");
    }
    
    @When("^User check review on trip advisor$")
    public void user_check_review_on_trip_advisor() throws Throwable {
    	TripAdvisorPage tr=new TripAdvisorPage(driver);
    	Thread.sleep(2000);
		tr.getadvisor().click();
		log.info("Trip Advisor page navigated successfully");
    }

    @Then("^Driver sld be close$")
    public void driver_sld_be_close() throws Throwable {
         driver.close();
    }
    
    //Savaari App Download
    
    @Given("^Initialize with browser chrome$")
    public void initialize_with_browser_chrome() throws Throwable {
    	Thread.sleep(5000);
    	driver =initializeDriver();
    }

    @And("^Navigate to the url \"([^\"]*)\" site$")
    public void navigate_to_the_url_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
   	 	driver.manage().window().maximize();
   	 	log.info("Savaari page navigated successfully");
    }
    
    @When("^User download the savaari app$")
    public void user_download_the_savaari_app() throws Throwable {
    	AppDwndPage app=new AppDwndPage(driver);
    	Thread.sleep(2000);
		app.getapp().click();
		log.info("Savaari app downloading page navigated successfully");
    }

    @Then("^closed the driver$")
    public void closed_the_driver() throws Throwable {
    	  driver.close();
    }
    
    //User Log Out
    @Given("^Initialize with the browser chrome$")
    public void initialize_with_the_browser_chrome() throws Throwable {
    	Thread.sleep(5000);
    	driver =initializeDriver();
    }

    @And("^Navigate to the savaari url \"([^\"]*)\" site$")
    public void navigate_to_the_savaari_url_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
   	 	driver.manage().window().maximize();
   	 	log.info("Savaari page navigated successfully");
    }

    @When("^User click on account section and log out$")
    public void user_click_on_account_section_and_log_out() throws Throwable {
    	SignIn sg=new SignIn(driver);
    	sg.signin().click();
    	sg.getEmail().sendKeys("syedrafi546@gmail.com");
    	sg.getPassword().sendKeys("uqumyq");
    	Thread.sleep(2000);
    	sg.getSigninButton().click();
    	LogoutPage lp=new LogoutPage(driver);
    	Thread.sleep(2000);
		lp.getclick().click();
		lp.getlogout().click();
		Thread.sleep(2000);
		lp.getslt().click();
		Thread.sleep(3000);
		log.info("Log Out successfully");
    }

    @Then("^close the chrome driver$")
    public void close_the_chrome_driver() throws Throwable {
        driver.close();
    }
	   
}