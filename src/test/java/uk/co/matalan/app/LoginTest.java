package uk.co.matalan.app;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.util.Locale;

public class LoginTest {


    private WebDriver driver;
    @Before
    public void preRun(){

    String BaseUrl = "https://www.matalan.co.uk/";
    String chromePath = "C:\\Users\\User\\IdeaProjects\\deal\\src\\WebtextMata\\.idea\\driver\\chrome\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",chromePath);
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    this.driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.navigate().to(BaseUrl);

    }

    @After
    public void postRun(){
        driver.quit();

    }
    @Test
    public void runnerTest(){
        String username = "rashsofi@gmail.com";
        String password  = "Wronskian263";


        BasePage basePage = new BasePage(driver);
        basePage.myAccountLoginPage();
        MyAccountPage myAccountPage = new MyAccountPage ( driver );
        myAccountPage.login(username, password);
        LoginValidationPage loginValidationPage = new LoginValidationPage (driver);
        loginValidationPage.validateLogin();
        String Url = driver.getCurrentUrl ();
        System.out.println (Url);
        String Title = driver.getTitle ();
        System.out.println (Title);

            }
        }



