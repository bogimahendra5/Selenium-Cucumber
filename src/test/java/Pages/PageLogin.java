package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {

    WebDriver driver;

    public PageLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement Username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement btnLogin;
    @FindBy(xpath = "//h3[contains(text(),'Epic sadface: Username and password do not match a')]")
    WebElement invalidUserOrPass;
    @FindBy(xpath = "//h3[normalize-space()='Epic sadface: Username is required']")
    WebElement invalidUser;
    @FindBy(xpath = "//h3[normalize-space()='Epic sadface: Password is required']")
    WebElement invalidPass;

    public void InputUsername(String inputUsername){
        Username.sendKeys(inputUsername);
    }
    public void InputPassword(String inputPassword){
        Password.sendKeys(inputPassword);
    }
    public void ClickBtnLogin(){
        btnLogin.click();
    }
    public void btnLoginDisplayed(){
        btnLogin.isDisplayed();
    }
    public void errorUserPass(){
        invalidUserOrPass.isDisplayed();
    }
    public void errorUser(){
        invalidUser.isDisplayed();
    }
    public void errorPass(){
        invalidPass.isDisplayed();
    }

}
