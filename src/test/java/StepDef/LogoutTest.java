package StepDef;

import Pages.PageHome;
import Pages.PageLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LogoutTest{

    WebDriver driver;
    PageHome pagehome = new PageHome(driver);
    LoginTest logintest = new LoginTest(driver);

    @Given("In any webpage")
    public void inAnyWebpage() {
        String username = "standard_user";
        String password = "secret_sauce";
        logintest.OpenWebUrl();
        logintest.inputUsernameAndPassword(username,password);
        logintest.clickLoginButton();
    }

    @And("Go to side menu")
    public void goToSideMenu() {
        pagehome.HamburgerMenu();
    }

    @When("Click button Logout")
    public void clickButtonLogout() {
        pagehome.ClickBtnLogout();
    }

    @Then("Should success logout and redirected to loginpage")
    public void shouldSuccessLogoutAndRedirectedToLoginpage() {
        PageLogin pagelogin = new PageLogin(driver);
        pagelogin.btnLoginDisplayed();
    }

}
