package homepage.pageobject;

import common.TestBase;
import homepage.webelement.WebElementHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectHomePage extends WebElementHomePage {


    @FindBy (how = How.XPATH, using =SearchBoxFieldWebElement)
    public static WebElement searchBox;

    public static WebElement getSearchBox(){
        return searchBox;
    }
   public static void enterSearchValue(String searchValue){
        getSearchBox().sendKeys(searchValue);
   }
   public static void searchMobilePhone(){
        enterSearchValue("Mobile Phone");
   }
    public static void searchTshirt(){
        enterSearchValue("T-Shirt");
    }

public static void searchValentineGift(){
        enterSearchValue("ValentineGift");
    }
}




