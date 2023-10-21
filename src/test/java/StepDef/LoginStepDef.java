package StepDef;

import Locators.HomePage;
import Locators.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepDef {

    Driver driver = new Driver();
    LoginPage page = new LoginPage(driver.getDriver());


    @Given("I Navigate to Login Page")
    public void i_navigate_to_login_page() {
       driver.getDriver().get(Config.getProperty("url"));
    }
    @When("I Enter Username as {string}")
    public void i_enter_username_as(String username) {
        page.username.sendKeys(username);

    }
    @When("I Enter Password as {string}")
    public void i_enter_password_as(String password) {
        page.password.sendKeys(password);

    }
    @When("I click Login Button")
    public void i_click_login_button() {
        page.loginButton.click();
    }
    @Then("I should Login Successfully")
    public void i_should_login_successfully() {
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));
        driver.closeDriver();



    }

}
