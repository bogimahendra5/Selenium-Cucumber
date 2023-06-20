package StepDef;

import Pages.PageHome;
import Pages.PageLogin;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
    WebDriver driver;
    PageLogin pagelogin;
    PageHome pagehome;

    public LoginTest(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @Given("Open web url")
    public void OpenWebUrl(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @And("Input username {string} and password {string}")
    public void inputUsernameAndPassword(String username, String password) {
        pagelogin = new PageLogin(driver);
        pagelogin.InputUsername(username);
        pagelogin.InputPassword(password);
    }

    @When("Click login button")
    public void clickLoginButton() {
        pagelogin = new PageLogin(driver);
        pagelogin.ClickBtnLogin();
    }

    @Then("Should success login and redirected to homepage")
    public void shouldSuccessLoginAndRedirectedToHomepage() {
        pagehome = new PageHome(driver);
        pagehome.Inventory();
    }

    @Then("Showing error message username required")
    public void showingErrorMessageUsernameRequired() {
        pagelogin = new PageLogin(driver);
        pagelogin.errorUser();
    }

    @Then("Showing error message password required")
    public void showingErrorMessagePasswordRequired() {
        pagelogin = new PageLogin(driver);
        pagelogin.errorPass();
    }

    @Then("Showing error message username and password not match")
    public void showingErrorMessageUsernameAndPasswordNotMatch() {
        pagelogin = new PageLogin(driver);
        pagelogin.errorUserPass();
    }

    @After
    public void CloseBrowser(){
        driver.quit();
    }

}
