package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        // Mouse Hover on Gear Menu
        homePage.mouseHoverGearLink();
        //click on begs
        homePage.mouseHoverAndClickOnBagsLink();
        //* Click on Product Name ‘Overnight Duffle’
        bagsPage.mouseHoverAndClickOnProductName();

        //Verify the text ‘Overnight Duffle’
        String expectedBagText = "Overnight Duffle";
        String actualBagText = bagsPage.getTextOverNightDuffle();
        Assert.assertEquals(actualBagText,expectedBagText,"Verify the two text");

        // Change Qty 3
        overNightDufflePage.changeQuality3();

        //Click on ‘Add to Cart’ Button.
        overNightDufflePage.clickOnAddTOCart();

        //verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        String actualText = overNightDufflePage.getTextAddToCart();
        Assert.assertEquals(actualText,expectedText,"Verify the two Strings");

        //click on shopping cart link into msg
        overNightDufflePage.clickOnShoppingCart();

        //* Verify the product name ‘Overnight Duffle’
        String expectedProductName = "Overnight Duffle";
        String actualProductName = shoppingCartPage.getTextVerifyOvernightDuffle();
        Assert.assertEquals(actualProductName,expectedProductName,"Verify the Overnight Duffle");

        //Verify the quantity is ‘3’
        String expectedQuantity = "3";
        Thread.sleep(20);
        String actualQuantity = shoppingCartPage.getTextVerifyQuantity3();
        Assert.assertEquals(actualQuantity,expectedQuantity,"Verify the quantity is 3");

        //Verify the product price '$135.00'
        String expectedProductPrice = "$135.00";
        Thread.sleep(20);
        String actualProductPrice = shoppingCartPage.getTextVerifyProductPrice();
        Assert.assertEquals(actualProductPrice,expectedProductPrice,"Verify the one product price");

        // Change Qty to 5
        Thread.sleep(20);
        shoppingCartPage.changeQuality5();

        //click on update shopping cart button
        shoppingCartPage.clickOnUpdateShoppingCart();

        //Verify the product price
        String expectedProductPrice$225 = "$225.00";
        String actualProductPrice$225 = shoppingCartPage.getTextVerifyPrice();
        Assert.assertEquals(actualProductPrice$225,expectedProductPrice$225,"Verify the two price");


    }
}
