package uk.co.matalan.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 public class BrowerFactory {

     private WebDriver driver;
     private BrowerFactory browerFactory;


     public WebDriver browerActivation() {

         String BaseUrl = "https://www.matalan.co.uk/";
         String chromePath = "C:\\Users\\User\\IdeaProjects\\deal\\src\\WebtextMata\\.idea\\driver\\chrome\\chromedriver.exe";
         System.setProperty ( "webdriver.chrome.driver", chromePath );
         ChromeOptions options = new ChromeOptions ();
         options.addArguments ( "--incognito" );
         this.driver = new ChromeDriver ( options );
         this.driver.manage ().window ().maximize ();
         this.driver.navigate ().to ( BaseUrl );
         return driver;

     }


     public void browerDeactivation() {
         if (driver != null) {
             driver.quit ();


         }



         }

     }
