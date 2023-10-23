package Locators;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//button[text()='Add Money to Checking']")
    public WebElement addMoneyToCheckingButton;

    @FindBy(id = "logOut")
    public WebElement LogOutButton;

    @FindBy(xpath = "//a[text()='Personal']")
    public WebElement PersonalButton;

    @FindBy(id = "name" )
    public WebElement fullName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='employment']")
    public WebElement employment;

    @FindBy(xpath = "//input[@id='income']")
    public WebElement income;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amount;

    @FindBy(xpath = "//input[@id='purpose']")
    public WebElement loanPurpose;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement SubmitButton;













}
