package uk.co.matalan.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Locale;

public class BasePage {


    protected WebDriver driver;



    public BasePage(WebDriver driver){
        this.driver = driver;


    }


    public   MyAccountPage myAccountLoginPage() {
        for ( WebElement element : driver.findElements ( By.tagName ( "a" ) ) ) {
            if (element.getAttribute("href").toLowerCase(Locale.ROOT).contains("/account/edit".toLowerCase(Locale.ROOT)) && element.getText().toLowerCase(Locale.ROOT).contains("my account")) {
                element.click();
                break;
            }
        }
                return new MyAccountPage(driver);
            }
        }
