package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestBase {
 public static WebDriver driver=null;

    public static void setUp(String url){
        System.setProperty("webdriver.chrome.driver","/Users/tofayelrana/IdeaProjects/EnhanceFrameWork/Generic/BrowserDriver/mac/chromedriver");
        driver= new ChromeDriver();
        driver.navigate(). to(url);


    }



}
