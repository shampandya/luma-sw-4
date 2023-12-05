package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    JacketsPage jacketsPage = new JacketsPage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenLink();
        //* Mouse Hover on Tops
        homePage.mouseHoverOnTopsLink();
        //* Click on Jackets
        homePage.mouseHoverAndClickOnJacketsLink();
        //* Select Sort By filter “Product Name”
        jacketsPage.clickOnSortByTextBox();
        jacketsPage.selectProductName();
        jacketsPage.getProductName();

        //Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());

    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenLink();
        //* Mouse Hover on Tops
        Thread.sleep(10);
        homePage.mouseHoverOnTopsLink();
        //click on jackets
        homePage.mouseHoverAndClickOnJacketsLink();
        //select sort by filter
        jacketsPage.clickOnSortByTextBox();
        //select 'price'
        jacketsPage.selectPriceOption();

        //* Verify the products price display in Low to High
        Assert.assertEquals(womenPage.getProductPriceList1(), womenPage.getProductPriceList2());

    }
}
