package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHome {

    WebDriver driver;

    public PageHome(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@id='inventory_container']")
    WebElement InventoryContainer;
    @FindBy(xpath = "//div[@class='app_logo']")
    WebElement logo;
    @FindBy(xpath = "//img[@alt='Open Menu']")
    WebElement btnHamburger;
    @FindBy(xpath = "logout_sidebar_link")
    WebElement btnLogout;
    @FindBy(xpath = "product_sort_container")
    WebElement FilterOption;


    public void HamburgerMenu() {
        btnHamburger.click();
    }
    public void Inventory(){
        InventoryContainer.isDisplayed();
    }
    public void ClickBtnLogout() {
        btnLogout.click();
    }

}