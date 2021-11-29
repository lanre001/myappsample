package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.BasePage;

import java.util.Locale;

public class LoginValidationPage extends BasePage {

    private By toggleLocator = By.id ( "toggleMobileNav" );

    public LoginValidationPage(WebDriver driver) {
        super ( driver );
    }

    public void validateLogin() {
        driver.findElement (toggleLocator  ).getText ().toLowerCase( Locale.ROOT ).contains ( "my account".toLowerCase( Locale.ROOT ) );

    }

}
