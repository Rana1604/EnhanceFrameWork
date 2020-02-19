package homepage.webelement;

import common.TestBase;

public class WebElementHomePage extends TestBase {
    /**
     * Given we are in Amazon Home Page
     * And Enter Mobile Phone in Search Box Field
     * And Click on Search Button
     * Then Validate the Search Result

     * Navigate back to HomePage
     * Enter T-Shirt in Search Field
     * Click on Search Button
     * Enter T-Shirt in Search Field
     * Click on Search Button
     */

    public static final String SearchBoxFieldWebElement="//input[@id='twotabsearchtextbox']";
    public static final String SearchButtonWebElement="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']";
    public static final String SearchResultValidForMobilePhoneWebElement="//a[contains(text(),'\"mobile phone\"')]";




    /**
     * Given we are in Amazon Home Page
     * Mouse Hover on Account and Lists
     * Click on Sign in
     * Enter email (Email phone for mobile accounts)
     * Click on Continue
     * Enter Password in Password Field
     * Check Keep me Sign in
     * Click on Sign in Button
     * Validate "There was a problem" and " Your Password is incorrect"
     */

    /**
     * Given we are in Amazon Home Page
     * Click on Toggle Menu Button
     * Display number of item under shop by category
     * validate Fire TV is Exit
     */

    /**
     * Given we are in Amazon Home Page
     * Click on Shop all Valentine's Day gifts link which is Displayed at Bottom of the Homepage
     * Click on Next Items and Click Vermont Teddy Bear
     * Select Qnt is 2
     * Click on 6 feet Bear
     * Add to Cart
     * Click on Cart at top right side Header Panel
     * Click proceed to checkout
     * Click on Sign in Button
     * Enter email (Email phone for mobile accounts)
     * Click on Continue
     * Enter Password in Password Field
     * Check Keep me Sign in
     * Click on Sign in Button
     */




}




