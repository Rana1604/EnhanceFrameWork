package testhomepage;

import common.TestBase;
import homepage.pageobject.PageObjectHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends TestBase {


    static PageObjectHomePage homePage;

    public static void inItEliments(){
        homePage= PageFactory.initElements(driver,PageObjectHomePage.class);

    }


@Test
    public static void testSearchMobilePhone(){
    setUp("http//www.amazon.com");
        inItEliments();

}


}
