package uk.co.matalan.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class LoginValidationPage extends BasePage {


    public LoginValidationPage(WebDriver driver) {
        super ( driver );
    }

    public void validateLogin() {
        driver.findElement ( By.id ( "toggleMobileNav" ) ).getText ().toLowerCase( Locale.ROOT ).contains ( "my account".toLowerCase( Locale.ROOT ) );

    }

}
