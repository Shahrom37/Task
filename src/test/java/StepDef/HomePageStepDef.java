package StepDef;

import Locators.HomePage;
import Locators.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDef {
    Driver driver = new Driver();
    LoginPage page = new LoginPage(driver.getDriver());
   HomePage homePage = new HomePage(driver.getDriver());

    @Given("I login Into The TN Bank")
    public void i_login_into_the_tn_bank() {
       driver.getDriver().get(Config.getProperty("url"));
       driver.getDriver().get(Config.getProperty("username"));
       driver.getDriver().get(Config.getProperty("password"));
       page.loginButton.click();


    }
    @When("I am On the Home Page")
    public void i_am_on_the_home_page() {
        Assert.assertEquals(driver.getDriver().getTitle(),Config.getProperty("//button[text()='Add Money to Checking']"));
    }
    @Then("I should See Add Money Button is Displayed")
    public void i_should_see_add_money_button_is_displayed() {
   //    Assert.assertEquals(homePage.)
    }

    @When("I amm On The Home Page")
    public void iAmmOnTheHomePage() {

    }

    @Then("I should See Log Out Button is Displayed")
    public void iShouldSeeLogOutButtonIsDisplayed() {

    }

    @And("I click Log out Button")
    public void iClickLogOutButton() {

    }

    @Then("I should Log out Button")
    public void iShouldLogOutButton() {
    }
}
