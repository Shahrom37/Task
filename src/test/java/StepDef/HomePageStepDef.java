package StepDef;

import Locators.HomePage;
import Locators.LoginPage;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class HomePageStepDef {
    Driver driver = new Driver();
    LoginPage loginPage = new LoginPage(driver.getDriver());
    HomePage homePage = new HomePage(driver.getDriver());
    Actions actions = new Actions(driver.getDriver());
    Alert alert;


    @Given("I login Into The TN Bank")
    public void i_login_into_the_tn_bank() {
        driver.getDriver().get(Config.getProperty("url"));
        loginPage.username.sendKeys(Config.getProperty("username"));
        loginPage.password.sendKeys(Config.getProperty("password"));
        loginPage.loginButton.click();


    }

    @When("I am On the Home Page")
    public void i_am_on_the_home_page() {
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));
    }

    @Then("I should See Add Money Button is Displayed")
    public void i_should_see_add_money_button_is_displayed() {
        Assert.assertTrue(homePage.addMoneyToCheckingButton.isDisplayed());

    }

    @Then("I should See Log Out Button is Displayed")
    public void iShouldSeeLogOutButtonIsDisplayed() {
        Assert.assertTrue(homePage.LogOutButton.isDisplayed());


    }

    @And("I click Log out Button")
    public void iClickLogOutButton() {
        homePage.LogOutButton.click();


    }

    @Then("I should Log out Button")
    public void iShouldLogOutButton() {
        Assert.assertEquals(driver.getDriver().getTitle(), "TN Bank - Login");

    }

    @Then("I should see Personal button is displayed")
    public void iShouldSeePersonalButtonIsDisplayed() {
        Assert.assertTrue(homePage.PersonalButton.isDisplayed());

    }

    @And("I click Personal Button")
    public void iClickPersonalButton() {
        homePage.PersonalButton.click();

    }

    @And("I should land on Personal Loan Application Form")
    public void iShouldLandOnPersonalLoanApplicationForm() {
        Assert.assertEquals(driver.getDriver().getTitle(),"Personal Loan Application Form");

    }

    @Then("I should fill out this application form")
    public void iShouldFillOutThisApplicationForm() {
        homePage.fullName.sendKeys("Mark james");
        homePage.email.sendKeys("123james@gmail.com");
        homePage.phoneNumber.sendKeys("705423567");
        homePage.address.sendKeys("2341 Main street Ave apt 2N brooklyn NY");
        homePage.employment.sendKeys("Manager");
        homePage.income.sendKeys("5000");
        homePage.amount.sendKeys("2000");
        homePage.loanPurpose.sendKeys("House");
        homePage.SubmitButton.click();
       // Alert alert = driver.switchTo().alert();


       // String alertText = alert.getText();
        //System.out.println("Alert's text is " + alertText);

        //alert.accept();

    }

    @And("After filling out and clicking submit I should see alert")
    public void afterFillingOutAndClickingSubmitIShouldSeeAlert() {
        alert = driver.getDriver().switchTo().alert();

    }


    @Then("I accept the alert")
    public void iAcceptTheAlert() {
        alert.accept();
    }
}












