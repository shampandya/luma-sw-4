package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public  void userShouldAddProductSuccessFullyToShoppinCart(){
        //* Mouse Hover on Men Menu
        homePage.mouseHoverOnMenLink();
        //* Mouse Hover on Bottoms
        homePage.mouseHoverOnBottomLink();
        //* Click on Pants
        homePage.mouseHoverAndClickOnPantsLink();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’
        pantsPage.mouseHoverOnCronusYogaPant();
        //click on size 32
        pantsPage.clickOnSize32();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’
        pantsPage.mouseHoverOnCronusYogaPant();
        //click on colour black
        pantsPage.clickOnColourBlack();

        //* Mouse Hover on product name ‘Cronus Yoga Pant’
        pantsPage.mouseHoverOnCronusYogaPant();
        //click on add to cart button
        pantsPage.clickOnAddToCart();

        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedMessage ="You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = pantsPage.getTheText();
        Assert.assertEquals(actualMessage,expectedMessage,"Both text matches");

        //* Click on ‘shopping cart’ Link into message
        pantsPage.clickOnShoppingCart();

        //* Verify the text ‘Shopping Cart.’
        String expectedText ="Shopping Cart";
        String actualText = shoppingCartPage.getTextShoppingCart();
        Assert.assertEquals(actualText,expectedText,"Both text matches");

        //* Verify the product name ‘Cronus Yoga Pant’
        String expectedProductName ="Cronus Yoga Pant";
        String actualProductName = shoppingCartPage.getTextVerifyCronusYogaPant();
        Assert.assertEquals(actualProductName,expectedProductName,"Both text are equal");

        //* Verify the product size ‘32’
        String expectedProductSize ="32";
        String actualProductSize = shoppingCartPage.getTextVerifySize32();
        Assert.assertEquals(actualProductSize,expectedProductSize,"Both text are equal");

        // Verify the product colour black.
        String expectedColourBlack ="Black";
        String actualColourBlack = shoppingCartPage.getTextVerifyColourBlack();
        Assert.assertEquals(actualColourBlack,expectedColourBlack,"Both text are equal");

    }
}
