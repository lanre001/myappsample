package uk.co.matalan.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class MyAccountPage extends BasePage{


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        driver.findElement ( By.id ( "account_email" )).sendKeys ( username );
        driver.findElement ( By.id ( "account_password" ) ).sendKeys ( password );
        driver.findElement ( By.id ( "recaptcha_disabled_btn" ) ).click ();


            }


        }



