package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.Locale;

public class BasePage {


    public LoginValidationPage myAccountLoginPage;
    protected WebDriver driver;
    private By aTagLocator = By.tagName ( "a" );



    public BasePage(WebDriver driver){
        this.driver = driver;


    }


    public MyAccountPage myAccountLoginPage() {
        for ( WebElement element : driver.findElements (aTagLocator ) ) {
            if (element.getAttribute("href").toLowerCase(Locale.ROOT).contains("/account/edit".toLowerCase(Locale.ROOT)) && element.getText().toLowerCase(Locale.ROOT).contains("my account")) {
                element.click();
                break;
            }
        }
                return new MyAccountPage(driver);
            }

    public void openbrower() {
        return;
    }
}
