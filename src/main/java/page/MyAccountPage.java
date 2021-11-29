package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.BasePage;

public class MyAccountPage extends BasePage {
 private By emailLocator = By.id ( "account_email" );
 private By passLocator = By.id ( "account_password" );
 private By enterLocator = By.id ( "recaptcha_disabled_btn") ;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        driver.findElement ( emailLocator).sendKeys ( username );
        driver.findElement ( passLocator ).sendKeys ( password );
        driver.findElement ( enterLocator ).click ();


            }


        }



