package uk.co.matalan.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.BasePage;
import page.LoginValidationPage;
import page.MyAccountPage;



public class LoginTest {


    private WebDriver driver;
    private BrowerFactory browerFactory;


    @Before
    public void preRun(){

        this.browerFactory = new BrowerFactory ();
        this.driver = browerFactory.browerActivation ();



    }

    @After
    public void postRun(){
        browerFactory.browerDeactivation ();

    }
    @Test(timeout = 100000)
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





